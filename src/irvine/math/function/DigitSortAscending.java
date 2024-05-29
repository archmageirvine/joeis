package irvine.math.function;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Sort the digits of a number into ascending order.
 * @author Sean A. Irvine
 */
public class DigitSortAscending extends AbstractFunction2D {

  /**
   * Sort the digits of a number.
   * @param base base to use
   * @param n number
   * @param base10Out should base 10 be used for output
   * @return sorted number
   */
  public static Z sortDigitsAscending(final int base, final Z n, final boolean base10Out) {
    if (n.isZero()) {
      return Z.ZERO;
    }
    final int[] counts = ZUtils.digitCounts(n, base);
    int numDigits = 0;
    for (int k = 1; k < counts.length; ++k) {
      numDigits += counts[k];
    }
    final char[] c = new char[numDigits];
    for (int k = 1, j = 0; k < counts.length; j += counts[k++]) {
      Arrays.fill(c, j, j + counts[k], (char) ('0' + k));
    }
    return base10Out ? new Z(new String(c), base) : new Z(new String(c));
  }

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public Z z(final long base, final Z n) {
    return sortDigitsAscending((int) base, n, true);
  }
}
