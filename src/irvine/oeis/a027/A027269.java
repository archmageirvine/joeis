package irvine.oeis.a027;

import irvine.math.z.Z;
import irvine.oeis.a026.A026536;

/**
 * A027269 a(n) = Sum_{k=0..2n-2} T(n,k) * T(n,k+2), with T given by A026536.
 * @author Sean A. Irvine
 */
public class A027269 extends A026536 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < 2 * mN - 1; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, k + 2)));
    }
    return sum;
  }
}
