package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026009;

/**
 * A027292 a(n) = Sum_{k=0..m} (k+1) * A026009(n, m-k) where m = floor(n/2)+1.
 * @author Sean A. Irvine
 */
public class A027292 extends A026009 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final long m = mN / 2 + 1;
    for (long k = 0; k <= m; ++k) {
      sum = sum.add(t(mN, m - k).multiply(k + 1));
    }
    return sum;
  }
}
