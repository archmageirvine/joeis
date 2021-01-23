package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027109 a(n) = Sum_{k=0..n} T(n,k) * T(n,n+k), with T given by A027082.
 * @author Sean A. Irvine
 */
public class A027109 extends A027082 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN + k)));
    }
    return sum;
  }
}
