package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026120;

/**
 * A027324 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+2), with T given by A026120.
 * @author Sean A. Irvine
 */
public class A027324 extends A026120 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = -1; k < mN - 1; ++k) {
      sum = sum.add(u(mN, k).multiply(u(mN, k + 2)));
    }
    return sum;
  }
}
