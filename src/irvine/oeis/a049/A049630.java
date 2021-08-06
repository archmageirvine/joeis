package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049630 a(n)=Sum{T(2i,n-2i): i=0,1,...,[ n/2 ]}, array T as in A049627.
 * @author Sean A. Irvine
 */
public class A049630 extends A049627 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 2; ++k) {
      sum = sum.add(t(2 * k, mN - 2 * k));
    }
    return sum;
  }
}
