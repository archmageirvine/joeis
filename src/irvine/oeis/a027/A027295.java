package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026022;

/**
 * A027295 <code>a(n) = Sum_{k=0..m-1} T(n,k) * T(n,k+1)</code>, where <code>m=n</code> for <code>n=0,1</code> and <code>m=floor((n+3)/2)</code> for <code>n &gt;= 2</code>, and T given by <code>A026022</code>.
 * @author Sean A. Irvine
 */
public class A027295 extends A026022 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long lim = mN >= 3 ? (mN + 1) / 2 + 1 : mN;
    for (long k = 0; k < lim; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, k + 1)));
    }
    return sum;
  }
}
