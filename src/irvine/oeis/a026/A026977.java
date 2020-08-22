package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026977 a(n) = Sum_{k=0..n-1} T(n,k) * T(n,k+1), with T given by A026659.
 * @author Sean A. Irvine
 */
public class A026977 extends A026659 {

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
