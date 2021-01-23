package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026769;

/**
 * A027244 a(n) = Sum_{k=0..n} (k+1) * A026769(n, n-k).
 * @author Sean A. Irvine
 */
public class A027244 extends A026769 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, mN - k).multiply(k + 1));
    }
    return sum;
  }
}
