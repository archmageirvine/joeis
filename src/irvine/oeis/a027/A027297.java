package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026022;

/**
 * A027297 a(n) = Sum_{k=0..floor((n-3)/2)} T(n,k) * T(n,k+3), with T given by A026022.
 * @author Sean A. Irvine
 */
public class A027297 extends A026022 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long lim = (mN - 3) / 2;
    for (long k = 0; k <= lim; ++k) {
      sum = sum.add(t(mN, k).multiply(t(mN, k + 3)));
    }
    return sum;
  }
}
