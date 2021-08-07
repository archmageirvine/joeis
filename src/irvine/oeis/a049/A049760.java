package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049760 a(n) = Sum_{k=1..n} T(n,k), array T as in A049759.
 * @author Sean A. Irvine
 */
public class A049760 extends A049759 {

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
