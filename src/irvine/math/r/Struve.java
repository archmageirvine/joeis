package irvine.math.r;

import static irvine.math.r.Gamma.gamma;
import static java.lang.Math.abs;
import static java.lang.Math.floor;
import static java.lang.Math.pow;

/**
 * Struve function.
 *
 * @author Sean A. Irvine
 */
public final class Struve {

  // prevent instantiation
  private Struve() { }

  /**
   * Compute the Struve function <code>H_v(x)</code> of order v and argument x.
   * Negative x is rejected unless v is an integer.
   *
   * @param v parameter
   * @param x parameter
   * @return <code>H_v(x)</code>
   */
  public static double struve(final double v, final double x) {

    double f = floor(v);
    if (v < 0 && v - f == 0.5) {
      double y = Bessel.j(-v, x);
      f = 1 - f;
      final double g = 2 * floor(f / 2);
      if (g != f) {
        y = -y;
      }
      return y;
    }
    final double t = 0.25 * x * x;
    final double ax = abs(x);
    double g = 1.5 * abs(v);
    final double y;
    if (ax > 30 && ax > g) {
      y = Double.NaN;
    } else {
      y = Hypergeometric.hypergeometric12(1, 1.5, 1.5 + v, -t);
    }
    final double ya;
    if (f < 18 || x < 0) {
      ya = Double.NaN;
    } else {
      ya = Hypergeometric.hypergeometric30(1, 0.5, 0.5 - v, -1 / t);
    }
    final double h = pow(0.5 * x, v - 1);

    if (!Double.isNaN(y)) {
      g = gamma(v + 1.5);
      return y * h * t / (0.5 * Constants.SQRT_PI * g);
    } else {
      g = gamma(v + 0.5);
      return ya * h / (Constants.SQRT_PI * g) + Bessel.y(v, x);
    }
  }

}

