package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049748 a(n) = Sum_{i=0..n} T(i,n-i), array T as in A049747.
 * @author Sean A. Irvine
 */
public class A049748 extends A049747 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(t(k, mN - k));
    }
    return sum;
  }
}
