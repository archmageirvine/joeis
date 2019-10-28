package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027078 <code>a(n) = Sum_{k=0..n} T(n,k) * T(n,n+k)</code>, with T given by <code>A027052</code>.
 * @author Sean A. Irvine
 */
public class A027078 extends A027052 {

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
