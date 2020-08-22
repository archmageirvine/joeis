package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026978 a(n) = Sum_{k=0..n-2} T(n,k) * T(n,k+2), with T given by A026659.
 * @author Sean A. Irvine
 */
public class A026978 extends A026659 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 1; ++k) {
      sum = sum.add(get(mN, k).multiply(get(mN, mN - k - 2)));
    }
    return sum;
  }
}
