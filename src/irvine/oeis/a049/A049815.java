package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049815 a(n)=Sum{T(n,k): k=1,2,...,n}, array T as in A049805.
 * @author Sean A. Irvine
 */
public class A049815 extends A049805 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(super.next());
    }
    return sum;
  }
}
