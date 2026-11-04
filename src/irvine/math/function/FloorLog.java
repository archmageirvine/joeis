package irvine.math.function;

import irvine.math.z.Z;

/**
 * Integer logarithm.
 * @author Sean A. Irvine
 */
class FloorLog extends AbstractFunction2 {

  /**
   * Compute floor(log_base(n)), for n &gt;= 1 and base &gt;= 2.
   * @param n the argument
   * @param base the base
   * @return floor(log_base(n))
   */
  @Override
  public int i(final Z n, final Z base) {
    if (n.compareTo(Z.ONE) < 0 || base.compareTo(Z.TWO) < 0) {
      throw new IllegalArgumentException();
    }
    if (n.compareTo(base) < 0) {
      return 0;
    }
    int lo = 0;
    int hi = 1;
    while (base.pow(hi).compareTo(n) <= 0) {
      lo = hi;
      hi *= 2;
    }
    while (hi - lo > 1) {
      final int mid = (lo + hi) / 2;
      if (base.pow(mid).compareTo(n) <= 0) {
        lo = mid;
      } else {
        hi = mid;
      }
    }
    return lo;
  }
}
