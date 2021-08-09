package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049618 a(n) = Sum_{i=0..floor(n/2)} T(2i,n-2i) where T is A049615.
 * @author Sean A. Irvine
 */
public class A049618 extends A049615 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(t(2 * k, mN - 2 * k));
    }
    return sum;
  }
}
