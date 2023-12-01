package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049826 a(n) = T(n,n) + T(n+1,n) + ... + T(2n-1,n) = sum over a period of n-th column of array T given by A049816.
 * @author Sean A. Irvine
 */
public class A049826 extends A049816 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(t(mN + k, mN));
    }
    return sum;
  }
}
