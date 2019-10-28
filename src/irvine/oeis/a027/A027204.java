package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026714;

/**
 * A027204 <code>a(n) = Sum_{k=0..n-3} T(n,k) * T(n,k+3)</code>, with T given by <code>A026714</code>.
 * @author Sean A. Irvine
 */
public class A027204 extends A026714 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k - 3)));
    }
    return sum;
  }
}
