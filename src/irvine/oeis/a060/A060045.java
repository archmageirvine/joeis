package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060045 Generalized sum of divisors function: third diagonal of A060044.
 * @author Sean A. Irvine
 */
public class A060045 extends A060044 {

  private int mN = 5;

  @Override
  public Z next() {
    mSum = Z.ZERO;
    search(++mN, 3, Z.ONE, 3, 0);
    return mSum;
  }
}
