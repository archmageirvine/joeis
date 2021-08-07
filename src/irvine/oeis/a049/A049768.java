package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049768 a(n) = Sum_{k = 1..n} T(n,k), where array T is A049767.
 * @author Sean A. Irvine
 */
public class A049768 extends A049767 {

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
