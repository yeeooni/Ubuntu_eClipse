public class Circle extends Dohyung {


	int radius;

	
	public Circle(int radius){
	
		this.radius = radius;

	}
		@Override
		public double getArea(){

			return Math.PI * Math.pow(radius, 2);
		}

	/*
	public int getArea(){
		
		return (int)(Math.PI * Math.pow(radius, 2));
			
	}
	*/
		@Override
		public double getRound(){

			return 2 * (Math.PI * radius);
		}

	/*
	public int getRound(){

		return 2 * (int)(Math.PI * radius);
	}
	*/


}