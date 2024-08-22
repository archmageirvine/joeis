package irvine.math;

import java.util.ArrayList;
import java.util.List;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * Various utility functions relating to continued fractions.
 * @author Sean A. Irvine
 */
public final class ContinuedFractionUtils {

  private ContinuedFractionUtils() { }

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
      if (n.isZero()) {
        return sum;
      }
      n = n.reciprocal();
    }
  }

  /**
   * The product of the non-zero terms in the continued fraction expansion of a rational number.
   * @param n number
   * @return sum
   */
  public static Z continuedFractionProduct(Q n) {
    Z prod = Z.ONE;
    while (true) {
      final Z t = n.toZ();
      if (!t.isZero()) {
        prod = prod.multiply(t);
      }
      n = n.subtract(t);
      if (n.isZero()) {
        return prod;
      }
      n = n.reciprocal();
    }
  }

  /**
   * The number of times that the <code>target</code> appears in the continued fraction for <code>n</code>.
   * @param n number
   * @param target number to be matched
   * @return sum
   */
  public static long continuedFractionTermCount(Q n, final Z target) {
    long cnt = 0;
    while (true) {
      final Z t = n.toZ();
      if (t.equals(target)) {
        ++cnt;
      }
      n = n.subtract(t);
      if (n.isZero()) {
        return cnt;
      }
      n = n.reciprocal();
    }
  }

  /**
   * Return the continued fraction expansion of a rational number.
   * @param n number
   * @return expansion
   */
  public static List<Z> continuedFraction(Q n, final int maxTerms) {
    final ArrayList<Z> res = new ArrayList<>();
    for (int k = 0; k < maxTerms; ++k) {
      final Z t = n.toZ();
      res.add(t);
      n = n.subtract(t);
      if (n.isZero()) {
        return res;
      }
      n = n.reciprocal();
    }
    return res;
  }

  /**
   * Return the continued fraction expansion of a rational number.
   * @param n number
   * @return expansion
   */
  public static List<Z> continuedFraction(final Q n) {
    return continuedFraction(n, Integer.MAX_VALUE);
  }

  /**
   * Convert a finite continued fraction into a rational number.
   * @param continuedFraction continued fraction
   * @return rational number
   */
  public static Q toQ(final List<Z> continuedFraction) {
    Z num = continuedFraction.get(continuedFraction.size() - 1);
    Z den = Z.ONE;
    for (int k = continuedFraction.size() - 2; k >= 0; --k) {
      final Z t = num.multiply(continuedFraction.get(k)).add(den);
      den = num;
      num = t;
    }
    return new Q(num, den);
  }
}
