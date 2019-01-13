package irvine.math.generic;

import irvine.math.api.Field;
import irvine.math.r.Constants;

/**
 * Implementation of hypergeometric functions.
 * @author Sean A. Irvine
 */
public final class TaylorSeries1F1 {

  private TaylorSeries1F1() { }

  private static final int MAX_ITERATIONS = 500;

  /**
   * Compute <code>F(a;b;z)</code> using a Taylor series expansion.
   * @param field field of elements
   * @param a upper parameter
   * @param b lower parameter
   * @param z argument
   * @param <E> element type
   * @return <code>F(a;b;z)</code> or null
   */
  public static <E extends Number> E hypergeometric(final Field<E> field, final E a, final E b, final E z) {
    E an = field.one();
    E sum = field.one();
    double oldAccuracy = 1;
    E j = field.zero();
    for (long k = 0; k < MAX_ITERATIONS; ++k, j = field.add(j, field.one())) {
      // Compute next term from previous term
      final E jp1 = field.add(j, field.one());
      final E t = field.multiply(field.divide(field.add(a, j), field.multiply(field.add(b, j), jp1)), z);
      an = field.multiply(an, t);
      // Update sum so far
      sum = field.add(sum, an);
      final double accuracy = Math.abs(an.doubleValue() / sum.doubleValue());
      if (oldAccuracy < Constants.MACHINE_PRECISION && accuracy < Constants.MACHINE_PRECISION) {
        return sum;
      }
      oldAccuracy = accuracy;
    }
    return null; // Failed to converge
  }
}
