package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026148;

/**
 * A027334 <code>a(n) = Sum_{k=0..m} (k+1) * A026148(n, m-k)</code>, where <code>m=0</code> for <code>n=1; m=n+1</code> for <code>n &gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A027334 extends A026148 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long lim = mN < 2 ? mN : mN + 2;
    for (long k = 0; k <= lim; ++k) {
      sum = sum.add(get(mN, lim - k).multiply(k + 1));
    }
    return sum;
  }
}
