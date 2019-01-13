package irvine.math.r;

/**
 * Chi-squared test.
 * @author Sean A. Irvine
 */
public final class ChiSquared  {

  private ChiSquared() { }

  /**
   * Return the chi-squared distribution function for probability <code>p</code>
   * and <code>v</code> degrees of freedom.
   * @param v degrees of freedom, v &gt; 0
   * @param p 0.000002 &lt;= p &lt;= 0.999998
   * @return chi-squared value
   * @exception ArithmeticException if <code>p</code> is out of bounds or degrees of
   * freedom is non-positive.
   */
  public static double chiSquared(final double v, final double p) {
    if (p < 0.000002 || p > 0.999998) {
      throw new ArithmeticException("p out of bounds in chisquared");
    } else if (v <= 0.0) {
      throw new ArithmeticException("Nonpositive degrees of freedom in chisquared");
    }
    final double xx = 0.5 * v;
    final double c = xx - 1.0;
    final double g = Gamma.lgamma(xx);
    double ch;
    if (v < -1.24 * Math.log(p)) {
      ch = Math.pow(p * xx * Math.exp(g + xx * Constants.LN2), 1.0 / xx);
      if (ch < 0.5E-6) {
        return ch;
      }
    } else if (v > 0.32) {
      final double x = Stats.inverseNormal(p);
      final double p1 = 0.222222 / v;
      ch = x * Math.sqrt(p1) + 1.0 - p1;
      ch = ch * ch * ch;
      ch *= v;
      if (ch > 2.2 * v + 6.0) {
        ch = -2.0 * (Math.log(1.0 - p) - c * Math.log(0.5 * ch) + g);
      }
    } else {
      ch = 0.4;
      double q;
      final double a = Math.log(1.0 - p);
      do {
        q = ch;
        final double p1 = 1.0 + ch * (4.67 + ch);
        final double p2 = ch * (6.73 + ch * (6.66 + ch));
        final double t = -0.5 + (4.67 + 2.0 * ch) / p1 - (6.73 + ch * (13.32 + 3.0 * ch)) / p2;
        ch -= (1.0 - Math.exp(a + g + 0.5 * ch + c * Constants.LN2) * p2 / p1) / t;
      } while (Math.abs(q / ch - 1.0) > 0.01);
    }
    for (int i = 0; i < 7; ++i) {
      final double q = ch;
      final double p1 = 0.5 * ch;
      final double p2 = p - Gamma.incompletegamma(xx, p1);
      final double t = p2 * Math.exp(xx * Constants.LN2 + g + p1 - c * Math.log(ch));
      final double b = t / ch;
      final double a = 0.5 * t - b * c;
      final double s1 = (210.0 + a * (140.0 + a * (105.0 + a * (84.0 + a * (70.0 + 60.0 * a))))) / 420.0;
      ch += t * (1.0 + .5 * t * s1 - b * c * (s1 - b * (((420.0 + a * (735.0 + a * (966.0 + a * (1141.0 + 1278.0 * a)))) / 2520.0) - b * (((210.0 + a * (462.0 + a * (707.0 + 932.0 * a))) / 2520.0) - b * (((252.0 + a * (672.0 + 1182.0 * a) + c * (294.0 + a * (889.0 + 1740.0 * a))) / 5040.0) - b * (((84.0 + 264.0 * a + c * (175.0 + 606.0 * a)) / 2520.0) - b * ((120.0 + c * (346.0 + 127.0 * c)) / 5040.0)))))));
      if (Math.abs(q / ch - 1.0) > 0.5E-6) {
        return ch;
      }
    }
    return ch;
  }

}
