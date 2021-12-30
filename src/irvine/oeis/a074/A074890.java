package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A074890 Decimal form of binary integers produced by a modified version of Wolfram's Rule 30 one-dimensional cellular automaton.
 * @author Georg Fischer
 */
public class A074890 implements Sequence {

  protected Z mBase10;

  /** Construct the sequence. */
  public A074890() {
    mBase10 = Z.ONE;
  }

  /**
   * Apply Rule 30 to a binary String.
   * Adapted from the original Java program in A074890.
   * @param base2 String with digits 0, 1.
   * @return transformed binary String.
   */
  private String applyR30(final String base2) {
    int a0;
    int a1;
    int a2;
    int newDigit;
    final StringBuilder newBase2 = new StringBuilder();
    for (int i = -1; i < base2.length(); ++i) {
      a0 = i < 1 ? 0 : base2.charAt(i - 1) == '0' ? 0 : 1;
      a1 = i < 0 ? 0 : base2.charAt(i) == '0' ? 0 : 1;
      a2 = i == base2.length() - 1 ? 0 : base2.charAt(i + 1) == '0' ? 0 : 1;
      newDigit = (a1 == 0 && a2 == 0) ? a0 : 1 - a0; // Wolfram's Rule 30
      newBase2.append(newDigit == 0 ? '0' : '1');
    }
    return newBase2.toString();
  }

  @Override
  public Z next() {
    final Z result = mBase10;
    mBase10 = new Z(applyR30(mBase10.toString(2)), 2);
    return result;
  }
}

/*Java class to generate sequence
package irvine.oeis.ca;

public class A074890 { 
  static String zero="0", one="1"; 
  public static void main(String[] args) { 
    int base10 = 1; System.out.println(base10); 
    for(int i=0; i<30; i++) System.out.println(base10 = base10Convert(applyR30(Integer.toBinaryString(base10)))); 
  }
  static String applyR30(String base2) { 
    int a0, a1, a2, newDigit; StringBuffer newBase2 = new StringBuffer(); 
    for(int i=-1; i<base2.length(); i++) { 
      if(i<1) a0=0; else a0=base2.substring(i-1, i).equals(zero)?0:1; 
      if(i<0) a1=0; else a1=base2.substring(i, i+1).equals(zero)?0:1; 
      if(i==base2.length()-1) a2=0; else a2=base2.substring(i+1, i+2).equals(zero)?0:1; 
      newDigit = a1==0&&a2==0?a0:1-a0; //Wolfram's Rule 30 
      newBase2.append(newDigit==0?zero:one); 
    } 
    return newBase2.toString(); 
  }
  static int base10Convert(String R30) { 
    int newBase10 = 0; 
    for(int i=0; i<R30.length(); i++) 
      if(!R30.substring(i, i+1).equals(zero)) newBase10 += powerOf2(R30.length()-i-1); 
    return newBase10; 
  }
  static int powerOf2(int power) { 
    int p = 1; 
    for(int i=0; i<power; i++) 
      p*=2; 
    return p; 
  } 
}
*/
