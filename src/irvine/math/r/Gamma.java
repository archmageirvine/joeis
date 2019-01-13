package irvine.math.r;

import static irvine.math.r.Constants.EULER;
import static irvine.math.r.Constants.LN_PI;
import static irvine.math.r.Constants.LN_SQRT_TAU;
import static irvine.math.r.Constants.MACHINE_PRECISION;
import static irvine.math.r.Constants.MAXLOG;
import static irvine.math.r.Constants.SQRT_TAU;
import static irvine.math.r.PolyEval.chebyshev;
import static irvine.math.r.PolyEval.p1eval;
import static irvine.math.r.PolyEval.polyeval;
import static irvine.math.r.Stats.inverseNormal;
import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Double.isInfinite;
import static java.lang.Double.isNaN;
import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.exp;
import static java.lang.Math.floor;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
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

  /**
   * Compute the incomplete gamma integral of a and x. This function is defined
   * by <code>incompletegamma(a,x) = (1/\gamma(x))\int_0^x e^{-t}t^{a-1} dt</code>.
   *
   * @param a parameter
   * @param x parameter
   * @return the incomplete gamma function of a and x
   */
  public static double incompletegamma(final double a, final double x) {
    if (x <= 0 || a <= 0) {
      return 0;
    }
    if (x > 1 && x > a) {
      return 1 - incompletegammacomplement(a, x);
    }
    final double ax = a * log(x) - x - lgamma(a);
    if (ax < -MAXLOG) {
      return 0; // underflow
    }
    final double axe = exp(ax);
    // power series
    double r = a;
    double c = 1;
    double ans = 1;
    do {
      ++r;
      c *= x / r;
      ans += c;
    } while (c / ans > MACHINE_PRECISION);
    return ans * axe / a;
  }

  // constants needed for continued fraction scaling
  private static final double IGCBIG = 4.503599627370496E15;
  private static final double IGCBIGINV = 1 / IGCBIG;

  /**
   * Compute the complement of the incomplete gamma integral. That is,
   * <code>incompletegammacomplement(a,x) = 1 - incompletegamma(a,x)</code>.
   *
   * @param a parameter
   * @param x parameter
   * @return <code>1 - incompletegamma(a,x)</code>
   */
  public static double incompletegammacomplement(final double a, final double x) {
    if (x <= 0 || a <= 0) {
      return 1;
    }
    if (x < 1 || x < a) {
      return 1 - incompletegamma(a, x);
    }
    final double ax = a * log(x) - x - lgamma(a);
    if (ax < -MAXLOG) {
      return 0; // underflow
    }
    final double axe = exp(ax);
    // continued fraction
    double y = 1 - a;
    double z = x + y + 1;
    double c = 0;
    double pkm2 = 1;
    double qkm2 = x;
    double pkm1 = x + 1;
    double qkm1 = z * x;
    double ans = pkm1 / qkm1;
    double t;
    do {
      z += 2;
      final double yc = ++y * ++c;
      final double pk = pkm1 * z - pkm2 * yc;
      final double qk = qkm1 * z - qkm2 * yc;
      if (qk != 0) {
        final double r = pk / qk;
        t = abs((ans - r) / r);
        ans = r;
      } else {
        t = 1;
      }
      pkm2 = pkm1;
      pkm1 = pk;
      qkm2 = qkm1;
      qkm1 = qk;
      if (abs(pk) > IGCBIG) {
        pkm2 *= IGCBIGINV;
        pkm1 *= IGCBIGINV;
        qkm2 *= IGCBIGINV;
        qkm1 *= IGCBIGINV;
      }
    } while (t > MACHINE_PRECISION);
    return ans * axe;
  }

  // I added stricfp below on 2008-02-23 because the tests fail on
  // shannon when I don't have it.

  /**
   * Compute the inverse of the complemented incomplete gamma integral.
   * Given p, the function finds x such that
   * <code>incompletegammacomplement(a,x) = p</code>
   *
   * @param a parameter
   * @param y0 parameter
   * @return <code>inverseigammacomplement(a, y0)</code>
   */
  public static strictfp double inverseigammacomplement(final double a, final double y0) {
    if (a == 0) {
      return NaN;
    }
    // bound the solution
    double x0 = MAX_VALUE;
    double yl = 0;
    double x1 = 0;
    double yh = 1;
    final double dithresh = 5 * MACHINE_PRECISION;
    // approximation to inverse function
    double d = 1 / (9 * a);
    final double f = 1 - d - inverseNormal(y0) * sqrt(d);
    double x = a * f * f * f;
    double lgm = lgamma(a);
    for (int i = 0; i < 10; ++i) {
      if (x > x0 || x < x1) {
        break;
      }
      final double y = incompletegammacomplement(a, x);
      if (y < yl || y > yh) {
        break;
      }
      if (y < y0) {
        x0 = x;
        yl = y;
      } else {
        x1 = x;
        yh = y;
      }
      // compute the derivative of the function at this point
      d = (a - 1) * log(x) - x - lgm;
      if (d < -MAXLOG) {
        break;
      }
      // compute the step to the next approximation of x
      d = (y - y0) / -exp(d);
      if (abs(d / x) < MACHINE_PRECISION) {
        return x;
      }
      x -= d;
    }
    d = 0.0625;
    if (x0 == MAX_VALUE) {
      if (x <= 0) {
        x = 1;
      }
      while (!isInfinite(d)) {
        x *= 1 + d;
        final double y = incompletegammacomplement(a, x);
        if (isNaN(y)) {
          return NaN;
        }
        //        System.err.println("a=" + a + " y0=" + y0 + " y="+y + " x=" + x + " d=" + d);
        if (y < y0) {
          x0 = x;
          yl = y;
          break;
        }
        d += d;
      }
    }
    d = 0.5;
    int dir = 0;
    for (int i = 0; i < 400; ++i) {
      x = x1 + d * (x0 - x1);
      final double y = incompletegammacomplement(a, x);
      lgm = (x0 - x1) / (x1 + x0);
      if (abs(lgm) < dithresh) {
        break;
      }
      lgm = (y - y0) / y0;
      if (abs(lgm) < dithresh) {
        break;
      }
      if (x <= 0) {
        break;
      }
      if (y >= y0) {
        x1 = x;
        yh = y;
        if (dir < 0) {
          dir = 0;
          d = 0.5;
        } else if (dir > 1) {
          d = 0.5 * d + 0.5;
        } else {
          d = (y0 - yl) / (yh - yl);
        }
        ++dir;
      } else {
        x0 = x;
        yl = y;
        if (dir > 0) {
          dir = 0;
          d = 0.5;
        } else if (dir < -1) {
          d *= 0.5;
        } else {
          d = (y0 - yl) / (yh - yl);
        }
        --dir;
      }
    }
    return x;
  }

  // Chebyshev coefficients
  private static final double[] RGAMMAR = {
    3.13173458231230000000E-17,
   -6.70718606477908000000E-16,
    2.20039078172259550000E-15,
    2.47691630348254132600E-13,
   -6.60074100411295197440E-12,
    5.13850186324226978840E-11,
    1.08965386454418662084E-9,
   -3.33964630686836942556E-8,
    2.68975996440595483619E-7,
    2.96001177518801696639E-6,
   -8.04814124978471142852E-5,
    4.16609138709688864714E-4,
    5.06579864028608725080E-3,
   -6.41925436109158228810E-2,
   -4.98558728684003594785E-3,
    1.27546015610523951063E-1
  };

  /**
   * Compute the reciprocal gamma function function; that is,
   * <code>1/gamma(x)</code>.
   *
   * @param x parameter
   * @return <code>1/gamma(x)</code>
   */
  public static double rgamma(final double x) {
    if (x > 34.84425627277176174) {
      return 1 / MAX_VALUE;
    }
    if (x < -34.034) {
      final double w = -x;
      double z = sin(PI * w);
      if (z == 0) {
        return 0;
      }
      final int sign;
      if (z < 0) {
        sign = 1;
        z = -z;
      } else {
        sign = -1;
      }
      final double y = log(w * z) - LN_PI + lgamma(w);
      if (y < -MAXLOG) {
        return sign / MAX_VALUE; // underflow
      }
      if (y > MAXLOG) {
        return sign * POSITIVE_INFINITY; // overflow
      }
      return sign * exp(y);
    }
    double z = 1;
    double w = x;
    while (w > 1) {
      z *= --w;
    }
    while (w < 0) {
      z /= w++;
    }
    if (w == 0) {
      return 0;
    }
    if (w == 1) {
      return 1 / z;
    }
    return w * (1 + chebyshev(4 * w - 2, RGAMMAR)) / z;
  }

}
