package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049817 a(n) = Sum_{k=1..n} T(n,k), array T as in A049816.
 * @author Sean A. Irvine
 */
public class A049817 extends A049816 {

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
