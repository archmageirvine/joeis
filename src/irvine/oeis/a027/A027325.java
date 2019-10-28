package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026120;

/**
 * A027325 <code>a(n) = Sum_{k=0..n-2} T(n,k) * T(n,k+3)</code>, with T given by <code>A026120</code>.
 * @author Sean A. Irvine
 */
public class A027325 extends A026120 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = -1; k < mN - 2; ++k) {
      sum = sum.add(u(mN, k).multiply(u(mN, k + 3)));
    }
    return sum;
  }
}
