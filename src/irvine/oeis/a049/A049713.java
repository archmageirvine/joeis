package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a048.A048149;

/**
 * A049713 a(n)=Sum{((-1)^i)*T(i,2n-i): i=0,1,...,2n}, array T as in A048149.
 * @author Sean A. Irvine
 */
public class A049713 extends A048149 {

  private long mN = -2;

  @Override
  public Z next() {
    mN += 2;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, get(k, mN - k));
    }
    return sum;
  }
}
