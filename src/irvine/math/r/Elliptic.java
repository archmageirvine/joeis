package irvine.math.r;

import static irvine.math.r.PolyEval.polyeval;

/**
 * Various elliptic functions.
 *
 * @author Sean A. Irvine
 */
public final class Elliptic  {

  /** Natural logarithm of 4 */
  private static final double LN4 = Math.log(4.0);

  // prevent instantiation
  private Elliptic() { }

  // arrays for K computation
  private static final double[] KP = {
    1.37982864606273237150E-4,
    2.28025724005875567385E-3,
    7.97404013220415179367E-3,
    9.85821379021226008714E-3,
    6.87489687449949877925E-3,
    6.18901033637687613229E-3,
    8.79078273952743772254E-3,
    1.49380448916805252718E-2,
    3.08851465246711995998E-2,
    9.65735902811690126535E-2,
    1.38629436111989062502E0
  };

  private static final double[] KQ = {
    2.94078955048598507511E-5,
    9.14184723865917226571E-4,
    5.94058303753167793257E-3,
    1.54850516649762399335E-2,
    2.39089602715924892727E-2,
    3.01204715227604046988E-2,
    3.73774314173823228969E-2,
    4.88280347570998239232E-2,
    7.03124996963957469739E-2,
    1.24999999999870820058E-1,
    4.99999999999999999821E-1
  };

  /**
   * Compute the complete elliptic integral of the first kind:
   *
   *            pi/2
   *             -
   *            | |
   *            |           dt
   * K(m)  =    |    ------------------
   *            |                   2
   *          | |    sqrt( 1 - m sin t )
   *           -
   *            0
   *
   * where m = 1 - x, using the approximation
   *
   *     P(z)  -  log z Q(z).
   *
   * The argument x is used rather than m so that the logarithmic
   * singularity at x = 1 will be shifted to the origin; this
   * preserves maximum accuracy.
   *
   * @param x parameter
   * @return K(x)
   */
  public static double k(final double x) {
    if (x < 0.0 || x > 1.0) {
      return Double.NaN;
    }
    if (x > Constants.MACHINE_PRECISION) {
      return polyeval(x, KP) - Math.log(x) * polyeval(x, KQ);
    } else if (x == 0.0) {
        return Double.POSITIVE_INFINITY;
    } else {
      return LN4 - 0.5 * Math.log(x);
    }
  }

 /**
  * Compute the incomplete elliptic integral of the first kind at the given
  * argument and amplitude:
  *
  *                phi
  *                 -
  *                | |
  *                |           dt
  * K(phi_m)  =    |    ------------------
  *                |                   2
  *              | |    sqrt( 1 - m sin t )
  *               -
  *                0
  *
  * of amplitude phi and modulus m.
  *
  * @param phi amplitude
  * @param m modulus
  * @return K(phi_m)
  */
  public static double k(double phi, final double m) {
    if (m == 0.0) {
      return phi;
    }
    double a = 1.0 - m;
    if (a == 0.0) {
      if (Math.abs(phi) >= Constants.HALF_PI) {
        return Double.POSITIVE_INFINITY;
      }
      return Math.log(Math.tan((Constants.HALF_PI + phi) * 0.5));
    }
    int npio2 = (int) Math.floor(phi / Constants.HALF_PI);
    if ((npio2 & 1) == 1) {
      ++npio2;
    }
    double k;
    if (npio2 != 0) {
      k = k(a);
      phi -= npio2 * Constants.HALF_PI;
    } else {
      k = 0.0;
    }
    boolean sign = false;
    if (phi < 0.0) {
      phi = -phi;
      sign = true;
    }
    double b = Math.sqrt(a);
    double t = Math.tan(phi);
    if (Math.abs(t) > 10.0) {
      // transform amplitude
      double e = 1.0 / (b * t);
      // avoiding multiple recursions
      if (Math.abs(e) < 10.0) {
        e = Math.atan(e);
        if (npio2 == 0) {
          k = k(a);
        }
        double temp = k - k(e, m);
        if (sign) {
          temp = -temp;
        }
        return npio2 * k + temp;
      }
    }
    a = 1.0;
    double c = Math.sqrt(m);
    int d = 1;
    int mod = 0;

    while (Math.abs(c / a) > Constants.MACHINE_PRECISION) {
      double temp = b / a;
      phi += Math.atan(t * temp) + (double) mod * Math.PI;
      mod = (int) ((phi + Constants.HALF_PI) / Math.PI);
      t = t * (1.0 + temp) / (1.0 - temp * t * t);
      c = (a - b) * 0.5;
      temp = Math.sqrt(a * b);
      a = (a + b) * 0.5;
      b = temp;
      d += d;
    }

    double temp = (Math.atan(t) + (double) mod * Math.PI) / (d * a);
    if (sign) {
      temp = -temp;
    }
    return npio2 * k + temp;
  }

  // arrays of E computation
  private static final double[] EP = {
    1.53552577301013293365E-4,
    2.50888492163602060990E-3,
    8.68786816565889628429E-3,
    1.07350949056076193403E-2,
    7.77395492516787092951E-3,
    7.58395289413514708519E-3,
    1.15688436810574127319E-2,
    2.18317996015557253103E-2,
    5.68051945617860553470E-2,
    4.43147180560990850618E-1,
    1.00000000000000000299E0
  };

  private static final double[] EQ = {
    3.27954898576485872656E-5,
    1.00962792679356715133E-3,
    6.50609489976927491433E-3,
    1.68862163993311317300E-2,
    2.61769742454493659583E-2,
    3.34833904888224918614E-2,
    4.27180926518931511717E-2,
    5.85936634471101055642E-2,
    9.37499997197644278445E-2,
    2.49999999999888314361E-1
  };

  /**
   * Compute the complete elliptic integral of the second kind
   *
   * <pre>
   *            pi/2
   *             -
   *            | |                 2
   * E(m)  =    |    sqrt( 1 - m sin t ) dt
   *          | |
   *           -
   *            0
   * </pre>
   *
   * where <code>m = 1 - m1</code>, using the approximation
   *
   *      <code>P(x)  -  x log x Q(x)</code>.
   *
   * Though there are no singularities, the argument <code>m1</code> is used
   * rather than m for compatibility with K().
   *
   * @param x parameter
   * @return elliptic integral of <code>x</code>
   */
  public static double e(final double x) {
    if (x <= 0.0 || x > 1.0) {
      if (x == 0.0) {
        return 1.0;
      }
      return Double.NaN;
    }
    return polyeval(x, EP) - Math.log(x) * (x * polyeval(x, EQ));
  }

 /**
  *
  * Approximates the integral
  *
  * <pre>
  *                phi
  *                 -
  *                | |
  *                |                   2
  * E(phi_m)  =    |    sqrt( 1 - m sin t ) dt
  *                |
  *              | |
  *               -
  *                0
  * </pre>
  *
  * of amplitude phi and modulus m.
  *
  * @param phi amplitude
  * @param m argument
  * @return E(phi_m)
  */
  public static double e(double phi, final double m) {
    if (m == 0.0) {
      return phi;
    }
    int npio2 = (int) Math.floor(phi / Constants.HALF_PI);
    if ((npio2 & 1) == 1) {
      ++npio2;
    }
    phi -= (double) npio2 * Constants.HALF_PI;
    boolean sign = false;
    if (phi < 0.0) {
      phi = -phi;
      sign = true;
    }
    double a = 1.0 - m;
    final double ee = e(a);
    if (a == 0.0) {
      return npio2 * ee + (sign ? -Math.sin(phi) : Math.sin(phi));
    }
    double t = Math.tan(phi);
    double b = Math.sqrt(a);
    if (Math.abs(t) > 10.0) {
      // transform the amplitude
      double e = 1.0 / (b * t);
      // avoiding multiple recursions
      if (Math.abs(e) < 10.0) {
        e = Math.atan(e);
        double temp = ee + m * Math.sin(phi) * Math.sin(e) - e(e, m);
        if (sign) {
          temp = -temp;
        }
        return npio2 * ee + temp;
      }
    }
    double c = Math.sqrt(m);
    a = 1.0;
    int d = 1;
    double e = 0.0;
    int mod = 0;

    while (Math.abs(c / a) > Constants.MACHINE_PRECISION) {
      double temp = b / a;
      phi += Math.atan(t * temp) + mod * Math.PI;
      mod = (int) ((phi + Constants.HALF_PI) / Math.PI);
      t = t * (1.0 + temp) / (1.0 - temp * t * t);
      c = (a - b) * 0.5;
      temp = Math.sqrt(a * b);
      a = (a + b) * 0.5;
      b = temp;
      d += d;
      e += c * Math.sin(phi);
    }
    double temp = ee / k(1.0 - m);
    temp *= (Math.atan(t) + mod * Math.PI) / (d * a);
    temp += e;
    if (sign) {
      temp = -temp;
    }
    return npio2 * ee + temp;
    }

  /**
   * Compute the Jacobian elliptic function <code>sn</code>
   *
   * @param u parameter
   * @param m parameter
   * @return <code>sn(u|m)</code>
   */
  public static double sn(final double u, final double m) {

    if (m < 0.0 || m > 1.0) {
      return Double.NaN;
    }
    if (m < 1.0E-9) {
      final double t = Math.sin(u);
      final double b = Math.cos(u);
      return t - (0.25 * m * (u - t * b)) * b;
    }
    if (m >= 0.9999999999) {
      final double b = Math.cosh(u);
      return Math.tanh(u) + 0.25 * (1.0 - m) * (b * Math.sinh(u) - u) / (b * b);
    }

    final double[] a = new double[9];
    final double[] c = new double[9];
    a[0] = 1.0;
    c[0] = Math.sqrt(m);
    double b = Math.sqrt(1.0 - m);
    double twon = 1.0;
    int i = 0;

    while (Math.abs(c[i] / a[i]) > Constants.MACHINE_PRECISION) {
      if (i > 7) {
        break; // overflow
      }
      final double ai = a[i++];
      c[i] = (ai - b) * 0.5;
      final double t = Math.sqrt(ai * b);
      a[i] = (ai + b) * 0.5;
      b = t;
      twon *= 2.0;
    }

    // backward recurrence
    double phi = twon * a[i] * u;
    do {
      final double t = c[i] * Math.sin(phi) / a[i];
      //b = phi;
      phi = (Math.asin(t) + phi) * 0.5;
    } while (--i != 0);

    return Math.sin(phi);
  }

  /**
   * Compute the Jacobian elliptic function <code>cn</code>
   *
   * @param u parameter
   * @param m parameter
   * @return <code>cn(u|m)</code>
   */
  public static double cn(final double u, final double m) {

    if (m < 0.0 || m > 1.0) {
      return Double.NaN;
    }
    if (m < 1.0E-9) {
      final double t = Math.sin(u);
      final double b = Math.cos(u);
      return b + (0.25 * m * (u - t * b)) * t;
    }
    if (m >= 0.9999999999) {
      final double b = Math.cosh(u);
      final double phi = 1.0 / b;
      return 1.0 / b - 0.25 * (1.0 - m) * Math.tanh(u) * phi * (b * Math.sinh(u) - u);
    }

    final double[] a = new double[9];
    final double[] c = new double[9];
    a[0] = 1.0;
    c[0] = Math.sqrt(m);
    double b = Math.sqrt(1.0 - m);
    double twon = 1.0;
    int i = 0;

    while (Math.abs(c[i] / a[i]) > Constants.MACHINE_PRECISION) {
      if (i > 7) {
        break; // overflow
      }
      final double ai = a[i++];
      c[i] = (ai - b) * 0.5;
      final double t = Math.sqrt(ai * b);
      a[i] = (ai + b) * 0.5;
      b = t;
      twon *= 2.0;
    }

    // backward recurrence
    double phi = twon * a[i] * u;
    do {
      final double t = c[i] * Math.sin(phi) / a[i];
      //b = phi;
      phi = (Math.asin(t) + phi) * 0.5;
    } while (--i != 0);

    return Math.cos(phi);
  }

  /**
   * Compute the Jacobian elliptic function <code>dn</code>
   *
   * @param u parameter
   * @param m parameter
   * @return <code>dn(u|m)</code>
   */
  public static double dn(final double u, final double m) {

    if (m < 0.0 || m > 1.0) {
      return Double.NaN;
    }
    if (m < 1.0E-9) {
      final double t = Math.sin(u);
      return 1.0 - 0.5 * m * t * t;
    }
    if (m >= 0.9999999999) {
      final double b = Math.cosh(u);
      final double phi = 1.0 / b;
      return phi + 0.25 * (1.0 - m) * Math.tanh(u) * phi * (b * Math.sinh(u) + u);
    }

    final double[] a = new double[9];
    final double[] c = new double[9];
    a[0] = 1.0;
    c[0] = Math.sqrt(m);
    double b = Math.sqrt(1.0 - m);
    double twon = 1.0;
    int i = 0;

    while (Math.abs(c[i] / a[i]) > Constants.MACHINE_PRECISION) {
      if (i > 7) {
        break; // overflow
      }
      final double ai = a[i++];
      c[i] = (ai - b) * 0.5;
      final double t = Math.sqrt(ai * b);
      a[i] = (ai + b) * 0.5;
      b = t;
      twon *= 2.0;
    }

    // backward recurrence
    double phi = twon * a[i] * u;
    do {
      final double t = c[i] * Math.sin(phi) / a[i];
      b = phi;
      phi = (Math.asin(t) + phi) * 0.5;
    } while (--i != 0);

    return Math.cos(phi) / Math.cos(phi - b);
  }

  /**
   * Compute the Jacobian elliptic function phi
   *
   * @param u parameter
   * @param m parameter
   * @return <code>phi(u|m)</code>
   */
  public static double phi(final double u, final double m) {

    if (m < 0.0 || m > 1.0) {
      return Double.NaN;
    }
    if (m < 1.0E-9) {
      return u - 0.25 * m * (u - Math.sin(u) * Math.cos(u));
    }
    if (m >= 0.9999999999) {
      final double b = Math.cosh(u);
      return 2.0 * Math.atan(Math.exp(u)) - Constants.HALF_PI + 0.25 * (1.0 - m) * (b * Math.sinh(u) - u) / b;
    }

    final double[] a = new double[9];
    final double[] c = new double[9];
    a[0] = 1.0;
    c[0] = Math.sqrt(m);
    double b = Math.sqrt(1.0 - m);
    double twon = 1.0;
    int i = 0;

    while (Math.abs(c[i] / a[i]) > Constants.MACHINE_PRECISION) {
      if (i > 7) {
        break; // overflow
      }
      final double ai = a[i++];
      c[i] = (ai - b) * 0.5;
      final double t = Math.sqrt(ai * b);
      a[i] = (ai + b) * 0.5;
      b = t;
      twon *= 2.0;
    }

    // backward recurrence
    double phi = twon * a[i] * u;
    do {
      final double t = c[i] * Math.sin(phi) / a[i];
      //      b = phi;
      phi = (Math.asin(t) + phi) * 0.5;
    } while (--i > 0); // possibly should be >= 0

    return phi;
  }

}
