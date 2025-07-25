package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077660 Sum of terms of n-th row of A077583.
 * @author Sean A. Irvine
 */
public class A077660 extends A077583 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
