package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026323;

/**
 * A027310 <code>a(n) = Sum_{k=0..n} T(n,k) * T(n,k+2)</code>, with T given by <code>A026323</code>.
 * @author Sean A. Irvine
 */
public class A027310 extends A026323 {

  private long mN = 0;

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
