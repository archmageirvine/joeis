package irvine.oeis.a059;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A059405 Numbers that are the product of their digits raised to positive integer powers.
 * @author Sean A. Irvine
 */
public class A059405 implements Sequence {

  // Some care is needed because some numbers have more than one possible expansion in terms of digits.
  // For example, 4128768.
  // First take out "required" factors arising from the digits in the number:
  // 4128768/4/2/8/7/6/8 = 192,
  // then we can write 192 = 8*6*4, but we cannot do 192 = 8*8*3.

  private long mN = 0;

  private boolean is(final long m, final int[] cnts) {
    if (m == 1) {
      return true;
    }
    for (int k = cnts.length - 1; k >= 2; --k) {
      if (cnts[k] > 0 && m % k == 0 && is(m / k, cnts)) {
        return true;
      }
    }
    return false;
  }

  private boolean is(final long n) {
    long m = n;
    final int[] cnts = ZUtils.digitCounts(n);
    if (cnts[0] > 0) {
      return false; // 0 never occurs in these numbers
    }
    // 1's are free, so start from 2
    for (int k = 2; k < cnts.length; ++k) {
      final long div = LongUtils.pow(k, cnts[k]);
      if (m % div != 0) {
        return false;
      }
      m /= div;
    }
    return is(m, cnts);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
