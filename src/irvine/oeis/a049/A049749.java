package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049749 a(n)=Sum{((-1)^i)*T(i,2n-i): i=0,1,...,2n}, array T as in A049747.
 * @author Sean A. Irvine
 */
public class A049749 extends A049747 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= 2 * mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Z.valueOf(t(k, 2 * mN - k)));
    }
    return sum;
  }
}
