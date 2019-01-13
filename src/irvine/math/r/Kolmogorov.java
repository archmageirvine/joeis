package irvine.math.r;

/**
 * Kolmogorov statistical functions.
 * @author Sean A. Irvine
 */
public final class Kolmogorov  {

  private Kolmogorov() { }

  /**
   * Kolmogorov's limiting distribution of two-sided test, returns probability that
   * sqrt(n) * maximum deviation &gt; y, or that maximum deviation &gt; y / sqrt(n). The
   * approximation is useful for the tail of the distribution when n is large.
   * @param y parameter
   * @return Kolmogorov value
   */
  public static double kolmogorov(final double y) {
    final double x = -2 * y * y;
    double sign = 1;
    double p = 0;
    double r = 1;
    double t;
    do {
      t = Math.exp(x * r * r);
      p += sign * t;
      if (t == 0) {
        break;
      }
      ++r;
      sign = -sign;
    } while (t / p > 1.1E-16);
    return p + p;
  }

  /**
   * Functional inverse of Kolmogorov statistic for two-sided test.
   * @param p probability
   * @return kolmogorov^{-1}(p)
   */
  public static double inverseKolmogorov(final double p) {
    if (p <= 0 || p > 1) {
      return Double.NaN;
    }
    double y = Math.sqrt(-0.5 * Math.log(0.5 * p));
    double t;
    do {
      t = -2 * y;
      final double dpdy = 4 * t * Math.exp(t * y);
      if (Math.abs(dpdy) > 0.0) {
        t = (p - kolmogorov(y)) / dpdy;
      } else {
        return 0; //underflow
      }
      y += t;
    } while (Math.abs(t / y) > 1.0E-10);
    return y;
  }
}
