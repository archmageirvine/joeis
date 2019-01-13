package irvine.math.r;

import static java.lang.Double.longBitsToDouble;

/**
 * Various double precision mathematical constants.
 *
 * @author Sean A. Irvine
 */
public final class Constants {

  private Constants() { }

  /** The natural logarithm of 2. */
  public static final double LN2 = longBitsToDouble(0x3FE62E42FEFA39EFL);

  /** 1/ln(2) */
  public static final double INV_LN2 = 1 / LN2;

  /** The natural logarithm of the largest finite double. */
  public static final double MAXLOG = longBitsToDouble(0x40862E42FEFA39EFL);
  // MAXLOG = Math.log(Double.MAX_VALUE);

  /** The natural logarithm of the smallest positive double. */
  //public static final double MINLOG = longBitsToDouble(0x71C3446D4385C087L);
  public static final double MINLOG = Math.log(Double.MIN_VALUE);

  /** Pi divided by two */
  public static final double HALF_PI = longBitsToDouble(0x3FF921FB54442D18L);

  /** Pi divided by four */
  public static final double QUARTER_PI = 0.25 * Math.PI;

  /** Pi times two */
  public static final double TAU = 2.0 * Math.PI;

  /** 1 / (2 * pi) = 1 / tau */
  public static final double INV_TAU = 1 / TAU;

  /** Euler's constant */
  public static final double EULER = 0.577215664901532860606512090082402431042159;

  /** The square root of 3 */
  public static final double SQRT3 = Math.sqrt(3);

  /** The square root of pi */
  public static final double SQRT_PI = Math.sqrt(Math.PI);

  /** The square root of 2 pi */
  public static final double SQRT_TAU = Math.sqrt(TAU);

  /** ln(sqrt(2 pi)) */
  public static final double LN_SQRT_TAU = Math.log(SQRT_TAU);

  /** The inverse of the square root of pi */
  public static final double INV_SQRT_PI = 1 / SQRT_PI;

  /** ln(pi) */
  public static final double LN_PI = Math.log(Math.PI);

  /** 2^-53, minimal number of bits in mantissa */
  public static final double MACHINE_PRECISION = 1.11022302462515654042E-16;

  /** 1/ln(10) */
  public static final double INV_LN10 = 1 / Math.log(10);

  /** Catalan's constant */
  public static final double CATALAN = 0.91596559417721901505460351493238411077414937428167213426649811962176301977625;

  /** 3 pi divided by four */
  public static final double THREE_PI_DIV4 = 0.75 * Math.PI;

  /** 2 divided by pi */
  public static final double TWO_DIV_PI = 2 / Math.PI;

  /** The square root of 2/pi */
  public static final double SQRT2_DIV_PI = Math.sqrt(TWO_DIV_PI);

  /** The square root of 1/2 */
  public static final double SQRT_HALF = Math.sqrt(0.5);

  /** Constant to convert from degrees to radians. */
  public static final double DEGREES_TO_RADIANS = Math.PI / 180;

  /** Convert bits to digits. */
  public static final double LG10 = Math.log(10) / Math.log(2);

  /** Square root of 2. */
  public static final double SQRT2 = Math.sqrt(2);

}
