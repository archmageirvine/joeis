package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026584;

/**
 * A027285 <code>a(n) = Sum_{k=0..2n-3} T(n,k) * T(n,k+3)</code>, with T given by <code>A026584</code>.
 * @author Sean A. Irvine
 */
public class A027285 extends A026584 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN - 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, 2 * mN - k - 3)));
    }
    return sum;
  }
}
