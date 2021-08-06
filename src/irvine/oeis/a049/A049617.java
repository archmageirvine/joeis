package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049617 a(n)=Sum{((-1)^i)*T(i,2n-i): i=0,1,...,2n}, array T as in A049615.
 * @author Sean A. Irvine
 */
public class A049617 extends A049615 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Z.valueOf(t(k, mN - k)));
    }
    return sum;
  }
}
