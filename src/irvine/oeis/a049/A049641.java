package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049641 a(n) = Sum_{i=0..n} ((-1)^i)*T(i,n-i), array T as in A049639.
 * @author Sean A. Irvine
 */
public class A049641 extends A049639 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.signedAdd((k & 1) == 0, Z.valueOf(t(k, mN - k)));
    }
    return sum;
  }
}
