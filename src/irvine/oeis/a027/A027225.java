package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026747;

/**
 * A027225 a(n) = Sum_{k=0..n-2} T(n,k) * T(n,k+2), with T given by A026747.
 * @author Sean A. Irvine
 */
public class A027225 extends A026747 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 1; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 2)));
    }
    return sum;
  }
}
