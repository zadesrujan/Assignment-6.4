package unreferencedobject;
//here we cretaed pacakage as unreferencedobject which that organizes a set of related classes and interfaces
public class Garbagecollector {
	//public : members which can access as public
		//class : is a context of java that are used to create objects and to define object data types and methods.
		//declares a class called Garbagecollector.
	public Garbagecollector() {
		// TODO Auto-generated constructor stub
		 System.out.println("object is garbage collected");
		//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
	}

	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		 Garbagecollector  v1=new Garbagecollector(); //initializing new GarbageCollector s1 
		 Garbagecollector  v2=new Garbagecollector(); //initializing new GarbageCollector s2
		 v1=null;  //s1 equals to null or empty
		 v2=null;  //s2 equals to null or empty
	  System.gc();//returns  gc  
	 }  
	
	}

