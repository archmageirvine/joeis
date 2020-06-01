package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026148;

/**
 * A027331 <code>a(n) = Sum_{k=0..m} T(n,k) * T(n,k+2)</code>, where <code>m=2</code> for <code>n=2</code> and <code>m=n+1</code> for <code>n &gt;= 3;</code> and T is given by <code>A026148</code>.
 * @author Sean A. Irvine
 */
public class A027331 extends A026148 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 2)));
    }
    return sum;
  }
}
