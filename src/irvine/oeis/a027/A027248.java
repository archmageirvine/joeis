package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026780;

/**
 * A027248 <code>a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+1)</code>, with T given by <code>A026780</code>.
 * @author Sean A. Irvine
 */
public class A027248 extends A026780 {

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
