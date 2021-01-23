package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027080 a(n) = Sum_{k=0..2n-2} T(n,k) * T(n,k+2), with T given by A027052.
 * @author Sean A. Irvine
 */
public class A027080 extends A027052 {

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
