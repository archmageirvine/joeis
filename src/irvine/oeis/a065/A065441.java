package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065441 Sum of absolute values of terms in n-th row of A065432.
 * @author Sean A. Irvine
 */
public class A065441 extends A065432 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next().abs());
    }
    return sum;
  }
}
