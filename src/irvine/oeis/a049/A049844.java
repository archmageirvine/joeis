package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049844 a(n)=Sum{T(n,k): k=1,2,...,n-1}, array T as in A049843.
 * @author Sean A. Irvine
 */
public class A049844 extends A049843 {

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
