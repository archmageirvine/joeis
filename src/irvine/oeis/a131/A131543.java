package irvine.oeis.a131;

/**
 * A131543 Least power of 2 having exactly n consecutive <code>9</code>'s in its decimal representation.
 * @author Sean A. Irvine
 */
public class A131543 extends A131541 {

  @Override
  protected int getSpecialDigit() {
    return 9;
  }

}

