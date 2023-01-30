package irvine.math.r;

/**
 * Lambert W function.
 * WARNING: This computation is only valid in certain ranges as in general
 * this function is complex.
 * @author Sean A. Irvine
 */
public final class LambertW {

  private LambertW() { }

  private static double newton(final double x, double w) {
    // Newton's method
    for (int k = 0; k < 24; ++k) {
      final double expW = Math.exp(w);
      final double nextW = w - (w * expW - x) / (w * expW + expW);
      if (Math.abs(w - nextW) <= Constants.MACHINE_PRECISION) {
        break;
      }
      w = nextW;
    }
    return w;
  }

  /**
   * Compute the Lambert W function.
   * @param x parameter
   * @return <code>W(x)</code>
   */
  public static double w(final double x) {
    if (x > 10) {
      return newton(x, Math.log(x) - Math.log(Math.log(x)));
    } else {
      return newton(x, x);
    }
  }

  /**
   * Compute the Lambert W function on the -1 branch.
   * Note: this may not be valid for all <code>x</code>.
   * @param x parameter
   * @return <code>W_{-1}(x)</code>
   */
  public static double wNeg1(final double x) {
    // Initial estimate
    return newton(x, Math.log(-x) - Math.log(-Math.log(-x)));
  }
}
