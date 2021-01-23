package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026022;

/**
 * A027298 a(n) = Sum_{k=0..m} (k+1) * A026022(n, k), where m=n for n=0,1 and m = floor((n+3)/2) for n &gt;= 2.
 * @author Sean A. Irvine
 */
public class A027298 extends A026022 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long lim = mN >= 3 ? (mN + 1) / 2 + 1 : mN;
    for (long k = 0; k <= lim; ++k) {
      sum = sum.add(t(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
