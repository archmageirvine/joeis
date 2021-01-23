package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027143 a(n) = Sum_{k=0..2n-3} T(n,k) * T(n,k+3), with T given by A027113.
 * @author Sean A. Irvine
 */
public class A027143 extends A027113 {

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
