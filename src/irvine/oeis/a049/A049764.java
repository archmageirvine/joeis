package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049764 a(n) = Sum_{k=1..n} T(n,k), array T as in A049763.
 * @author Sean A. Irvine
 */
public class A049764 extends A049763 {

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
