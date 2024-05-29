package irvine.math.function;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Count of the number of distinct digits in the number when written in a particular base.
 * @author Sean A. Irvine
 */
class DistinctDigitCount extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public long l(final long base, final Z n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    final int[] counts = ZUtils.digitCounts(n, (int) base);
    int result = 0;
    for (int c : counts) {
      if (c > 0) {
        ++result;
      }
    }
    return result;
  }

  @Override
  public Z z(final long base, final Z n) {
    return Z.valueOf(l(base, n));
  }
}
