import java.util.Scanner;

public class Program {
    public static void runProgram(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер: ");
        int number = scanner.nextInt();
        processException(number);

        int array[] = {0,1,2,3,4,5,6,7,8,9};
        System.out.println("Введите число от 0 до 9:"); // eсли ввести 10 то будет выведен аут оф баундс эксепшн
        int choice = scanner.nextInt();
        System.out.println("Вы выбрали " + array[choice]);
    }
    public static void processException(int number){
        try{
            if (number <= 1000000 || number >= 9999999){
                throw new PhoneException("Неправильно набран номрер");
            }

            System.out.println("Ваш номер: " + number);
        } catch (PhoneException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("конец обработки исключения");
        }
    }
}
