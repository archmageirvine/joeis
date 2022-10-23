package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A048723 Binary "exponentiation" without carries: {0..y}^{0..x}, where y (column index) is binary encoding of GF(2)-polynomial and x (row index) is the exponent.
 * @author Sean A. Irvine
 */
public class A048723 extends Sequence0 {

  private long mN = -1;
  private long mM = 0;

  private Z multiply(final Z a, final Z b) {
    Z sum = Z.ZERO;
    for (Z s = b, t = a; !s.isZero(); s = s.divide2(), t = t.multiply2()) {
      if (s.isOdd()) {
        sum = sum.xor(t);
      }
    }
    return sum;
  }

  protected Z power(final long a, final long b) {
    if (b == 0) {
      return Z.ONE;
    }
    final Z za = Z.valueOf(a);
    Z p = za;
    for (long k = 2; k <= b; ++k) {
      p = multiply(p, za);
    }
    return p;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return power(mM, mN - mM);
  }
}
