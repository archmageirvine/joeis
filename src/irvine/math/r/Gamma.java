package irvine.math.r;

import static irvine.math.r.Constants.EULER;
import static irvine.math.r.Constants.LN_PI;
import static irvine.math.r.Constants.LN_SQRT_TAU;
import static irvine.math.r.Constants.SQRT_TAU;
import static irvine.math.r.PolyEval.p1eval;
import static irvine.math.r.PolyEval.polyeval;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Double.isNaN;
import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.exp;
import static java.lang.Math.floor;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

/**
 * Methods associated with the gamma function.
 *
 * @author Sean A. Irvine
 */
public final class Gamma {

  private Gamma() { }

  /** Maximum value the gamma function will do without overflow */
  static final double MAXGAMMA = 171.624376956302725;

  // Arrays used in the computation of lgamma
  private static final double[] LGAMMAP = {
    8.11614167470508450300E-4,
   -5.95061904284301438324E-4,
    7.93650340457716943945E-4,
   -2.77777777730099687205E-3,
    8.33333333333331927722E-2
  };

  private static final double[] LGAMMAN = {
    -1.37825152569120859100E3,
    -3.88016315134637840924E4,
    -3.31612992738871184744E5,
    -1.16237097492762307383E6,
    -1.72173700820839662146E6,
    -8.53555664245765465627E5
  };

  private static final double[] LGAMMAD = {
    -3.51815701436523470549E2,
    -1.70642106651881159223E4,
    -2.20528590553854454839E5,
    -1.13933444367982507207E6,
    -2.53252307177582951285E6,
    -2.01889141433532773231E6
  };

  /** Variable holding the sign of the gamma function after call to <code>lgamma</code>. */
  static int sLGammaSign = 0;

  /**
   * Return the sign of the most recent call to <code>lgamma</code>.
   *
   * @return sign of <code>lgamma</code> result
   */
  public static int lgammaSign() {
    return sLGammaSign;
  }

  /**
   * Return the logarithm of the absolute value of the gamma function of a double.
   * The sign of the gamma function can be retrieved by calling <code>lgammaSign</code>
   * after the call to <code>lgamma</code>.
   *
   * @param x parameter
   * @return <code>ln|gamma(x)|</code>
   */
  public static double lgamma(double x) {
    if (x < -34) {
      final double q = -x;
      final double w = lgamma(q); // modifies sLGammaSign
      final double p = floor(q);
      if (p == q) {
        return sLGammaSign * POSITIVE_INFINITY;
      }
      final int i = (int) p;
      sLGammaSign = ((i & 1) == 0) ? -1 : 1;
      double z = q - p;
      if (z > 0.5) {
        z = p + 1 - q;
      }
      return LN_PI - log(q * sin(PI * z)) - w;
    }
    if (x < 13) {
      double z = 1;
      while (x >= 3) {
        z *= --x;
      }
      while (x < 2) {
        if (x == 0) {
          return POSITIVE_INFINITY;
        }
        z /= x++;
      }
      if (z < 0) {
        sLGammaSign = -1;
        z = -z;
      } else {
        sLGammaSign = 1;
      }
      if (x == 2) {
        return log(z);
      }
      x -= 2;
      final double p = x * polyeval(x, LGAMMAN) / p1eval(x, LGAMMAD);
      return log(z) + p;
    }
    if (x > 2.556348E305) {
      return POSITIVE_INFINITY;
    }
    sLGammaSign = 1;
    double q = (x - 0.5) * log(x) - x + LN_SQRT_TAU;
    if (x > 1E8) {
      return q;
    }
    final double p = 1 / (x * x);
    if (x >= 1000) {
      q += ((7.9365079365079365079365E-4 * p - 2.7777777777777777777778E-3) * p + 0.0833333333333333333333) / x;
    } else {
      q += polyeval(p, LGAMMAP) / x;
    }
    return q;
  }

  // Array for Stirling's approximation
  private static final double[] STIRLING = {
    7.87311395793093628397E-4,
   -2.29549961613378126380E-4,
   -2.68132617805781232825E-3,
    3.47222221605458667310E-3,
    8.33333333333482257126E-2
  };

  /** Stirling's approximation, used by gamma function */
  private static double stirling(final double x) {
    final double x1 = 1 / x;
    final double w = 1 + x1 * polyeval(x1, STIRLING);
    final double y, e = exp(x);
    if (x > 143.01608) {
      // try and avoid overflow
      final double v = pow(x, 0.5 * x - 0.25);
      y = v * (v / e);
    } else {
      y = pow(x, x - 0.5) / e;
    }
    return isNaN(y) ? POSITIVE_INFINITY : SQRT_TAU * y * w;
  }

  // Arrays used in gamma computation
  private static final double[] GAMMAN = {
    1.60119522476751861407E-4,
    1.19135147006586384913E-3,
    1.04213797561761569935E-2,
    4.76367800457137231464E-2,
    2.07448227648435975150E-1,
    4.94214826801497100753E-1,
    9.99999999999999996796E-1
  };

  private static final double[] GAMMAD = {
    -2.31581873324120129819E-5,
    5.39605580493303397842E-4,
   -4.45641913851797240494E-3,
    1.18139785222060435552E-2,
    3.58236398605498653373E-2,
   -2.34591795718243348568E-1,
    7.14304917030273074085E-2,
    1.00000000000000000320E0
  };

  /**
   * Compute the gamma function of a double.
   *
   * @param x parameter
   * @return gamma(x)
   */
  public static double gamma(double x) {
    if (x == POSITIVE_INFINITY) {
      return x;
    }
    final double q = abs(x);
    if (q > 33) {
      if (x < 0) {
        final double p = floor(q);
        if (p == q) {
          return NaN;
        }
        final int i = (int) p;
        double z = q - p;
        if (z > 0.5) {
          z = q - (p + 1);
        }
        z = PI / (abs(q * sin(PI * z)) * stirling(q));
        return (i & 1) == 0 ? -z : z;
      }
      return stirling(x);
    }

    double z = 1;
    while (x >= 3) {
      z *= --x;
    }
    while (x < 0) {
      if (x > -1E-9) {
        return z / ((1 + EULER * x) * x);
      }
      z /= x++;
    }
    while (x < 2) {
      if (x < 1E-9) {
        return x == 0 ? NaN : z / ((1 + EULER * x) * x);
      }
      z /= x++;
    }
    if (x == 2 /*|| x == 3*/) {
      return z;
    }
    x -= 2;
    return z * polyeval(x, GAMMAN) / polyeval(x, GAMMAD);
  }

  // Array for digamma computation
  private static final double[] DIGAMMA = {
    8.33333333333333333333E-2,
   -2.10927960927960927961E-2,
    7.57575757575757575758E-3,
   -4.16666666666666666667E-3,
    3.96825396825396825397E-3,
   -8.33333333333333333333E-3,
    8.33333333333333333333E-2
  };

  /**
   * The digamma function of a double
   *
   * @param x parameter
   * @return psi(x)
   */
  public static double digamma(double x) {
    double nz = 0;
    if (x <= 0) {
      final double p = floor(x);
      nz = x - p;
      if (nz == 0) {
        return NaN;
      }
      if (nz != 0.5) {
        if (nz > 0.5) {
          nz = x - (p + 1);
        }
        nz = PI / tan(PI * nz);
      } else {
        nz = 0;
      }
      x = 1 - x;
    }
    // check for positive integer up to 10
    double y;
    if (x <= 10 && x == floor(x)) {
      y = 0;
      final int n = (int) x;
      for (int i = 1; i < n; ++i) {
        y += 1 / (double) i;
      }
      return y - EULER - nz;
    }
    double q = 0;
    while (x < 10) {
      q += 1 / x++;
    }
    if (x < 1E17) {
      final double t = 1 / (x * x);
      y = t * polyeval(t, DIGAMMA);
    } else {
      y = 0;
    }
    return log(x) - 0.5 / x - y - q - nz;
  }
}
