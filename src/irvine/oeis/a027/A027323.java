package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026120;

/**
 * A027323 <code>a(n) = Sum_{k=0..m} T(n,k) * T(n,k+1)</code>, where <code>m=0</code> for <code>n=1; m=n</code> for <code>n &gt;= 2;</code> and T is given by <code>A026120</code>.
 * @author Sean A. Irvine
 */
public class A027323 extends A026120 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = -1; k < mN; ++k) {
      sum = sum.add(u(mN, k).multiply(u(mN, k + 1)));
    }
    return sum;
  }
}
