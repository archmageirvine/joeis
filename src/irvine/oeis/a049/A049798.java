package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049798 a(n) = (1/2)*Sum_{k = 1..n} T(n,k), array T as in A049800.
 * @author Sean A. Irvine
 */
public class A049798 extends A049800 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum.divide2();
  }
}
