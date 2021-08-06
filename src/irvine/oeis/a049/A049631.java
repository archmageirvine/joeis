package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049631 a(n)=Sum{T(2i+1,n-2i-1): i=0,1,...,[ (n+1)/2 ]}, array T as in A049627.
 * @author Sean A. Irvine
 */
public class A049631 extends A049627 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(t(2 * k + 1, mN - 2 * k - 1));
    }
    return sum;
  }
}
