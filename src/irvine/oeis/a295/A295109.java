package irvine.oeis.a295;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A295109 a(n) = (1/n) times the n-th derivative of the ninth tetration of x (power tower of order 9) x^^9 at x=1.
 * @author Georg Fischer
 */
public class A295109 extends A295028 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 9);
  }
}

