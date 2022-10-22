package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060046 Generalized sum of divisors function: third diagonal of A060047.
 * @author Sean A. Irvine
 */
public class A060046 extends A060047 {

  private int mN = 8;

  @Override
  public Z next() {
    mSum = Z.ZERO;
    search(++mN, 3, Z.ONE, -1);
    return mSum;
  }
}
