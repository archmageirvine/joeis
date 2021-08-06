package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049689 a(n)=Sum{((-1)^(i+1))*T(i,n-i): i=0,1,...,n}, array T as in A049687.
 * @author Sean A. Irvine
 */
public class A049689 extends A049687 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 1, Z.valueOf(t(k, mN - k)));
    }
    return sum;
  }
}
