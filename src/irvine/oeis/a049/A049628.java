package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049628 a(n)=Sum{T(i,n-i): i=0,1,...,n}, array T as in A049627.
 * @author Sean A. Irvine
 */
public class A049628 extends A049627 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
