package proje4;

import java.util.Scanner;

public class proje4_4 {

	 public static void main(String[] args) {
	     
		 int kenar1 ,kenar2 ;
	     double hipotenus;
		 Scanner input = new Scanner (System.in);
		 System.out.print("birinci kenar uzunluğunu giriniz :");
		 kenar1= input.nextInt();
		 System.out.print("ikinci kenar uzunluğunu giriniz :");
		 kenar2= input.nextInt();
		 hipotenus = Math.sqrt((kenar1*kenar1)+(kenar2*kenar2)); 
		 System.out.print("hipotenüsün uzunluğu ="+ hipotenus );
		
	} 
	
}


