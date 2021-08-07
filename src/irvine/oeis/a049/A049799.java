package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049799 a(n) = Sum_{k = 3..n} T(n,k), where the array T is A049801.
 * @author Sean A. Irvine
 */
public class A049799 extends A049801 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
