package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.a054.A054252;

/**
 * A082963 Number of n X n 0-1 matrices with half 1's and half 0's (rounded up/down if odd).
 * @author Sean A. Irvine
 */
public class A082963 extends A054252 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      step();
    }
    return mA.coeff(mN * mN / 2).toZ();
  }
}
