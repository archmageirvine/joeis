package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027076 a(n) = Sum_{k=0..2n} (k+1) * A027052(n, 2n-k).
 * @author Sean A. Irvine
 */
public class A027076 extends A027052 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, 2 * mN - k).multiply(k + 1));
    }
    return sum;
  }
}
