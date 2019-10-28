package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026769;

/**
 * A027240 <code>a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+1)</code>, with T given by <code>A026769</code>.
 * @author Sean A. Irvine
 */
public class A027240 extends A026769 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 1)));
    }
    return sum;
  }
}
