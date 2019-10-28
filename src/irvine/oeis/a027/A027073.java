package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027073 <code>a(n) = Sum_{k=0..n} T(n,k) * T(n,2n-k)</code>, with T given by <code>A027052</code>.
 * @author Sean A. Irvine
 */
public class A027073 extends A027052 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, 2 * mN - k)));
    }
    return sum;
  }
}
