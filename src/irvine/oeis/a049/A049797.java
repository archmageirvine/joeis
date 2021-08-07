package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049797 a(n) = Sum_{k = 2..n} T(n,k), array T as in A049800.
 * @author Sean A. Irvine
 */
public class A049797 extends A049800 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 2; k <= mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
