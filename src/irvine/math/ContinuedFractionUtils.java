package irvine.math;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Various utility functions relating to continued fractions.
 * @author Sean A. Irvine
 */
public final class ContinuedFractionUtils {

  private ContinuedFractionUtils() {}

  /**
   * The sum of the terms in the continued fraction expansion of a rational number.
   * @param n number
   * @return sum
   */
  public static Z continuedFractionSum(Q n) {
    Z sum = Z.ZERO;
    while (true) {
      final Z t = n.toZ();
      sum = sum.add(t);
      n = n.subtract(t);
      if (Q.ZERO.equals(n)) {
        return sum;
      }
      n = n.reciprocal();
    }
  }
}
