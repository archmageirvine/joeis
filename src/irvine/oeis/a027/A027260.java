package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a025.A025177;

/**
 * A027260 <code>a(n) = Sum_{k=0..2n-3} T(n,k) * T(n,k+3)</code>, with T given by <code>A025177</code>.
 * @author Sean A. Irvine
 */
public class A027260 extends A025177 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN - 2; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 3)));
    }
    return sum;
  }
}
