package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026714;

/**
 * A027202 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+1), with T given by A026714.
 * @author Sean A. Irvine
 */
public class A027202 extends A026714 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k - 1)));
    }
    return sum;
  }
}
