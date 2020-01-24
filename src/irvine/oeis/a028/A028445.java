package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028445 Number of cubefree words of length n on two letters.
 * @author Sean A. Irvine
 */
public class A028445 implements Sequence {

  // After M. F. Hasler

  // This could be made faster by avoiding use of String and doing bitwise xor etc.

  private int mN = -1;

  private boolean isMatch(final String v, int k, int j, final int l) {
    for (int i = 0; i < l; ++i) {
      if (v.charAt(--k) != v.charAt(--j)) {
        return false;
      }
    }
    return true;
  }

  private boolean isCubeFree(final String v) {
    for (int k = 3; k <= v.length(); ++k) {
      for (int j = 1; j <= k / 3; ++j) {
        if (isMatch(v, k, k - j, 2 * j)) {
          return false;
        }
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final long lim = 1L << mN;
    for (long m = 1L << (mN - 1); m < lim; ++m) {
      if (isCubeFree(Long.toBinaryString(m))) {
        sum = sum.add(2);
      }
    }
    return sum;
  }
}
