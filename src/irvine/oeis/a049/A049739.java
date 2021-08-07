package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049739 a(n)=Sum{T(i,n-i): i=0,1,...,n}, array T as in A049727.
 * @author Sean A. Irvine
 */
public class A049739 extends A049727 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(t(k, mN - k));
    }
    return sum;
  }
}
