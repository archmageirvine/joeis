package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049833 a(n) = T(2n-1,n) + T(2n,n+1) + ... + T(3n-3,2n-2) = sum over a period of n-th diagonal of array T given by A049828.
 * @author Sean A. Irvine
 */
public class A049833 extends A049828 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN - 1; ++k) {
      sum = sum.add(t(2 * mN - 1 + k, mN + k));
    }
    return sum;
  }
}
