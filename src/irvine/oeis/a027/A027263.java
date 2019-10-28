package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026519;

/**
 * A027263 <code>a(n) = Sum_{k=0..2n-1} T(n,k) * T(n,k+1)</code>, with T given by <code>A026519</code>.
 * @author Sean A. Irvine
 */
public class A027263 extends A026519 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 1)));
    }
    return sum;
  }
}
