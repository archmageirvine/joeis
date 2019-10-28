package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026082;

/**
 * A027319 <code>a(n) = Sum_{k=0..m} (k+1) * A026082(n, k)</code>, where <code>0 &lt;= k &lt;=</code> m, <code>m=n</code> for <code>n=0,1,2,3; m=2n</code> for <code>n &gt;= 4</code>.
 * @author Sean A. Irvine
 */
public class A027319 extends A026082 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(k + 1));
    }
    return sum;
  }
}
