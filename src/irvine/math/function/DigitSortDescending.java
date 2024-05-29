package irvine.math.function;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Sort the digits of a number into descending order.
 * @author Sean A. Irvine
 */
public class DigitSortDescending extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public Z z(final long base, final Z n) {
    final int[] counts = ZUtils.digitCounts(n, (int) base);
    int numDigits = 0;
    for (final int count : counts) {
      numDigits += count;
    }
    final char[] c = new char[numDigits];
    for (int k = counts.length - 1, j = 0; k >= 0; j += counts[k--]) {
      Arrays.fill(c, j, j + counts[k], (char) ('0' + k));
    }
    return new Z(new String(c), (int) base);
  }
}
