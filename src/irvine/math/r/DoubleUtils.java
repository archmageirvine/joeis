package irvine.math.r;

import java.text.NumberFormat;

/**
 * Utility functions for doubles.
 *
 * @author Sean A. Irvine
 */
public final class DoubleUtils {

  private DoubleUtils() { }

  /** Printing with two decimal places. */
  public static final NumberFormat NF2 = NumberFormat.getNumberInstance();
  /** Printing with three decimal places. */
  public static final NumberFormat NF3 = NumberFormat.getNumberInstance();
  /** Printing with four decimal places. */
  public static final NumberFormat NF4 = NumberFormat.getNumberInstance();
  /** Printing with five decimal places. */
  public static final NumberFormat NF5 = NumberFormat.getNumberInstance();
  /** Printing with eight decimal places. */
  public static final NumberFormat NF8 = NumberFormat.getNumberInstance();
  static {
    NF2.setMinimumFractionDigits(2);
    NF2.setMaximumFractionDigits(2);
    NF2.setGroupingUsed(false);
    NF3.setMinimumFractionDigits(3);
    NF3.setMaximumFractionDigits(3);
    NF3.setGroupingUsed(false);
    NF4.setMinimumFractionDigits(4);
    NF4.setMaximumFractionDigits(4);
    NF4.setGroupingUsed(false);
    NF5.setMinimumFractionDigits(5);
    NF5.setMaximumFractionDigits(5);
    NF5.setGroupingUsed(false);
    NF8.setMinimumFractionDigits(8);
    NF8.setMaximumFractionDigits(8);
    NF8.setGroupingUsed(false);
  }

  /**
   * Return the sign of a double. Zero is input is 0 or NaN.
   * +1 is x is positive and -1 if x is negative.
   *
   * @param x parameter
   * @return sgn(x)
   */
  public static int sgn(final double x) {
    return x == 0 || Double.isNaN(x) ? 0 : (x < 0 ? -1 : 1);
  }


  /**
   * Convert a degrees, minutes, seconds angle into a radians angle.
   * Does not check that 0&lt;=d&lt;360, 0&lt;=m&lt;60, or 0&lt;=s&lt;60.
   *
   * @param d degrees value
   * @param m minutes value
   * @param s seconds value
   * @return radians value
   */
  public static double dmsToRadians(final double d, final double m, final double s) {
    return ((d * 60 + m) * 60 + s) * 4.8481368110953599358991410E-6;
  }

  /**
   * Test if the given array sums to 1 to within normal double precision.
   * @param dist distribution
   * @return true if they sum to 1
   */
  public static boolean isProbabilityDistribution(final double[] dist) {
    double s = 0;
    for (final double p : dist) {
      s += p;
    }
    return Math.abs(s - 1) <= Double.MIN_NORMAL;
  }
}
