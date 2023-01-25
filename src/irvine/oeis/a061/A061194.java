package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A061194 Minimum positive value of lcm{1,...,n}*(s_1/1 + ... + s_n/n), where each s_i equals 1 or -1.
 * @author Sean A. Irvine
 */
public class A061194 extends A003418 {

  {
    super.next();
    setOffset(1);
  }
  private int mN = 0;

  @Override
  public Z next() {
    final Z lcm = super.next();
    if (++mN > 64) {
      // This code is too slow to get this far anyway
      throw new UnsupportedOperationException();
    }
    final Z[] t = new Z[mN];
    for (int k = 0; k < mN; ++k) {
      t[k] = lcm.divide(k + 1);
    }
    // Bitset with 0 -> positive, 1 -> negative
    // WLOG assume lcm/1 is positive, so only need n-1 bits
    Z min = lcm;
    for (long k = 0; k < 1L << (mN - 1); ++k) {
      Z sum = lcm;
      long i = k;
      for (int j = 1; j < mN; ++j, i >>>= 1) {
        sum = sum.signedAdd((i & 1) == 0, t[j]);
      }
      sum = sum.abs();
      if (sum.compareTo(min) < 0) {
        min = sum;
      }
    }
    return min;
  }
}
