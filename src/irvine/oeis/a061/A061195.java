package irvine.oeis.a061;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A061195 Minimum positive numerator of s_1/1 + ... + s_n/n in lowest terms, where each s_i equals 1 or -1.
 * @author Sean A. Irvine
 */
public class A061195 extends A003418 {

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
    final Q[] t = new Q[mN];
    for (int k = 0; k < mN; ++k) {
      t[k] = new Q(1, k + 1);
    }
    // Bitset with 0 -> positive, 1 -> negative
    // WLOG assume 1/1 is positive, so only need n-1 bits
    Z min = lcm;
    for (long k = 0; k < 1L << (mN - 1); ++k) {
      Q sum = Q.ONE;
      long i = k;
      for (int j = 1; j < mN; ++j, i >>>= 1) {
        sum = sum.signedAdd((i & 1) == 0, t[j]);
      }
      final Z num = sum.abs().num();
      if (num.compareTo(min) < 0) {
        min = num;
      }
    }
    return min;
  }
}
