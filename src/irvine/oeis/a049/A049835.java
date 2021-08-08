package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049835 a(n)=Sum{T(n,k): k=1,2,...,n}, array T as in A049834.
 * @author Sean A. Irvine
 */
public class A049835 extends A049834 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(t(mN, k));
    }
    return sum;
  }
}
