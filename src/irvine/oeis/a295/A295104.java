package irvine.oeis.a295;
// Generated by gen_seq4.pl build/arronk

import irvine.math.z.Z;

/**
 * A295104 a(n) = (1/n) times the n-th derivative of the fourth tetration of x (power tower of order 4) x^^4 at x=1.
 * @author Georg Fischer
 */
public class A295104 extends A295028 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.matrixElement(mN, 4);
  }
}

