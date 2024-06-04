package irvine.math.polynomial;

import java.util.Locale;

/**
 * Convenience class collecting together implementations of various polynomial series.
 * @author Sean A. Irvine
 */
public final class Series {

  private Series() { }

  /** Elliptic K function multiplied by 2/pi. */
  public static final Series1 ELLIPTIC_K = new EllipticK();
  /** Elliptic E function multiplied by 2/pi. */
  public static final Series1 ELLIPTIC_E = new EllipticE();
  /** Elliptic D function multiplied by 1/pi. */
  public static final Series1 ELLIPTIC_D = new EllipticD();

  /** Bessel I function without leading <code>(x/2)^n/n!</code> factor. */
  public static final Series2 BESSEL_I = new BesselI();
  /** Bessel y function, <code>y_n(x)</code>. */
  public static final Series2 BESSEL_Y = new BesselY();


  /**
   * Get a series from its name.
   * @param name series name
   * @return the series
   * @throws NoSuchFieldException if the function was not found
   */
  public static Series1 getSeries1(final String name) throws NoSuchFieldException {
    try {
      return (Series1) Series.class.getField(name.toUpperCase(Locale.getDefault())).get(null);
    } catch (final IllegalAccessException e) {
      throw new RuntimeException("Could not access " + name);
    }
  }

  /**
   * Get a series from its name.
   * @param name series name
   * @return the series
   * @throws NoSuchFieldException if the function was not found
   */
  public static Series2 getSeries2(final String name) throws NoSuchFieldException {
    try {
      return (Series2) Series.class.getField(name.toUpperCase(Locale.getDefault())).get(null);
    } catch (final IllegalAccessException e) {
      throw new RuntimeException("Could not access " + name);
    }
  }

  /**
   * Print a series.
   * For example, <code>Series elliptic_k 10</code> (no argument series).
   * For example, <code>Series bessel_i 0 10</code> (one parameter series).
   * @param args expression
   */
  public static void main(final String[] args) throws NoSuchFieldException {
    if (args.length == 2) {
      final Series1 series = getSeries1(args[0]);
      final int n = Integer.parseInt(args[1]);
      System.out.println(series.s(n));
    } else {
      final Series2 series = getSeries2(args[0]);
      final long v = Long.parseLong(args[1]);
      final int n = Integer.parseInt(args[2]);
      System.out.println(series.s(v, n));
    }
  }
}
