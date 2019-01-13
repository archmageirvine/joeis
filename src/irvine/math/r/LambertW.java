package irvine.math.r;

/**
 * Lambert W function.
 * @author Sean A. Irvine
 */
public final class LambertW {

  private LambertW() { }

  /**
   * Compute the Lambert W function.
   * @param x parameter
   * @return <code>W(x)</code>
   */
  public static double w(final double x) {
    // Initial estimate
    double w;
    if (x > 10) {
      w = Math.log(x) - Math.log(Math.log(x));
    } else {
      w = x;
    }
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
}
