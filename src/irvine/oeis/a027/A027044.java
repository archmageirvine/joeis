package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027044 <code>a(n) = Sum_{k=0..2n} (k+1) * A027023(n,2n-k)</code>.
 * @author Sean A. Irvine
 */
public class A027044 extends A027023 {

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
