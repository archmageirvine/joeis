package irvine.math.r;

import static irvine.math.r.Constants.MACHINE_PRECISION;
import static irvine.math.r.Gamma.gamma;
import static java.lang.Math.abs;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.rint;

import irvine.math.c.C;
import irvine.math.c.ComplexField;

/**
 * Hypergeometric functions.
 *
 * @author Sean A. Irvine
 */
public final class Hypergeometric {

  private Hypergeometric() { }

  private static double[] hys2f1(final double a, final double b, final double c, final double x) {
    double umax = 0;
    double s = 1;
    double u = 1;
    double k = 0;
    do {
      if (abs(c) < 1E-13) {
        return new double[] {Double.POSITIVE_INFINITY, 1};
      }
      final double m = k + 1;
      u *= (a + k) * (b + k) * x / ((c + k) * m);
      s += u;
      k = abs(u);
      if (k > umax) {
        umax = k;
      }
      k = m;
    } while (abs(u / s) > MACHINE_PRECISION);
    return new double[] {s, (MACHINE_PRECISION * umax) / abs(s)};
  }

  private static double[] hyt2f1(final double a, final double b, final double c, final double x) {
    final double s = 1 - x;
    if (x < 0.5) {
      if (b > a) {
        final double[] z = hys2f1(a, c - b, c, -x / s);
        z[0] *= pow(s, -a);
        return z;
      } else {
        final double[] z = hys2f1(c - a, b, c, -x / s);
        z[0] *= pow(s, -b);
        return z;
      }
    }

    double y;
    final double d = c - a - b;
    final double id = rint(d);

    if (x > 0) {
      if (abs(d - id) > 1E-13) {
        double[] z = hys2f1(a, b, c, x);
        if (z[1] < 1E-12) {
          return z;
        }
        z = hys2f1(a, b, 1 - d, s);
        final double[] z1 = hys2f1(c - a, c - b, d + 1, s);
        double q = z[0] * gamma(d) / (gamma(c - a) * gamma(c - b));
        double r = pow(s, d) * z1[0] * gamma(-d) / (gamma(a) * gamma(b));
        y = q + r;
        q = abs(q);
        r = abs(r);
        if (q > r) {
          r = q;
        }
        z[1] += z1[1] + (MACHINE_PRECISION * r) / y;
        z[0] = y * gamma(c);
        return z;
      } else {
        // psi function expansion
        final double e;
        final double d1;
        final double d2;
        final int aid;
        if (id >= 0) {
          e = d;
          d1 = d;
          d2 = 0;
          aid = (int) id;
        } else {
          e = -d;
          d1 = 0;
          d2 = d;
          aid = -(int) id;
        }
        final double ax = log(s);
        y = Gamma.digamma(1) + Gamma.digamma(e + 1) - Gamma.digamma(a + d1) - Gamma.digamma(b + d1) - ax;
        y /= gamma(e + 1);
        double r, q, p = (a + d1) * (b + d1) * s / gamma(e + 2);
        double t = 1;
        do {
          r = Gamma.digamma(1 + t) + Gamma.digamma(1 + t + e) - Gamma.digamma(a + t + d1) - Gamma.digamma(b + t + d1) - ax;
          q = p * r;
          y += q;
          p *= s * (a + t + d1) / (t + 1);
          p *= (b + t + d1) / (t + 1 + e);
          ++t;
        } while (abs(q / y) > 1E-13);

        if (id == 0) {
          return new double[] {y * gamma(c) / (gamma(a) * gamma(b)), 0};
        }

        double y1 = 1;

        if (aid != 1) {
          t = 0;
          p = 1;
          for (int i = 1; i < aid; ++i) {
            r = 1 - e + t;
            p *= s * (a + t + d2) * (b + t + d2) / r;
            p /= ++t;
            y1 += p;
          }
        }

        p = gamma(c);
        y1 *= gamma(e) * p / (gamma(a + d1) * gamma(b + d1));
        y *= p / (gamma(a + d2) * gamma(b + d2));
        if ((aid & 1) != 0) {
          y = -y;
        }
        q = pow(s, id);
        if (id > 0) {
          y *= q;
        } else {
          y1 *= q;
        }
        return new double[] {y + y1, 0};
      }
    }

    return hys2f1(a, b, c, x);
  }


  /**
   * Compute the confluent hypergeometric function <code>F(a;b;x)</code>.
   *
   * @param a parameter
   * @param b parameter
   * @param x parameter
   * @return <code>F(a;b;x)</code>
   */
  public static double hypergeometric(final double a, final double b, final double x) {
    return ComplexField.SINGLETON.hypergeometric(new C(a), new C(b), new C(x)).re();
  }


  /**
   * Compute the hypergeometric function <code>F(a,b;c;x)</code>. Parameters are
   * considered to be integers if they are within 1E-13 of the
   * nearest integer.
   *
   * @param a parameter
   * @param b parameter
   * @param c parameter
   * @param x parameter
   * @return <code>F(a,b;c;x)</code>.
   */
  public static double hypergeometric21(final double a, final double b, final double c, final double x) {

    double ia = rint(a);
    double ib = rint(b);
    final double ax = abs(x);
    final double s = 1 - x;
    int flag = 0;

    if (a <= 0 && abs(a - ia) < 1E-13) {
      flag |= 1;
    }
    if (b <= 0 && abs(b - ib) < 1E-13) {
      flag |= 2;
    }
    if (ax < 1) {
      if (abs(b - c) < 1E-13) {
        return pow(s, -a); // b == c
      }
      if (abs(a - c) < 1E-13) {
        return pow(s, -b); // a == c
      }
    }

    if (c <= 0) {
      final double ic = rint(c);
      if (abs(c - ic) < 1E-13) {
        if (((flag & 1) == 1 && ia > ic) || ((flag & 2) == 2 && ib > ic)) {
          return hyt2f1(a, b, c, x)[0];
        }
        return Double.POSITIVE_INFINITY;
      }
    }

    if (flag != 0) {
      return hyt2f1(a, b, c, x)[0];
    }
    if (ax > 1) {
      return Double.POSITIVE_INFINITY;
    }
    final double p = c - a;
    ia = rint(p);
    if (ia <= 0 && abs(p - ia) < 1E-13) {
      flag |= 4;
    }
    double r = c - b;
    ib = rint(r);
    if (ib <= 0 && abs(r - ib) < 1E-13) {
      flag |= 8;
    }
    final double d = c - a - b;
    final double id = rint(d);
    //    double q = abs(d - id);

    if (abs(ax - 1) < 1E-13) {
      if (x > 0) {
        if ((flag & 12) != 0) {
          if (d >= 0) {
            return pow(s, d) * hys2f1(c - a, c - b, c, x)[0];
          } else {
            return Double.POSITIVE_INFINITY;
          }
        }
        if (d <= 0) {
          return Double.POSITIVE_INFINITY;
        }
        return gamma(c) * gamma(d) / (gamma(p) * gamma(r));
      }
      if (d <= -1) {
        return Double.POSITIVE_INFINITY;
      }
    }

    if (d < 0) {
      final double[] y = hyt2f1(a, b, c, x);
      if (y[1] < 1E-12) {
        return y[0];
      }
      final int aid = 2 - (int) id;
      double z = y[0];
      double e = c + (double) aid;
      double d2 = hypergeometric21(a, b, e, x);
      double d1 = hypergeometric21(a, b, e + 1, x);
      final double q = a + b + 1;
      for (int i = 0; i < aid; ++i) {
        r = e - 1;
        z = (e * (r - (2 * e - q) * x) * d2 + (e - a) * (e - b) * x * d1) / (e * r * s);
        e = r;
        d1 = d2;
        d2 = z;
      }
      return z;
    }

    if ((flag & 12) != 0) {
      return pow(s, d) * hys2f1(c - a, c - b, c, x)[0];
    }
    return hyt2f1(a, b, c, x)[0];
  }

  /**
   * Compute the hypergeometric function <code>F(a;b,c;x)</code>.
   *
   * @param a parameter
   * @param b parameter
   * @param c parameter
   * @param x parameter
   * @return <code>F(a;b,c;x)</code>
   */
  public static double hypergeometric12(double a, double b, double c, final double x) {
    double a0 = 1;
    double sum = 1;
    double n = 1;
    double t;
    double max = 0;

    do {
      if (a == 0) {
        return sum;
      }
      if (b == 0 || c == 0 || a0 > 1E34 || n > 200) {
        return Double.NaN; // did not converge
      }
      a0 *= (a++ * x) / (b++ * c++ * n++);
      sum += a0;
      final double z = abs(a0);
      if (z > max) {
        max = z;
      }
      if (sum != 0) {
        t = abs(a0 / sum);
      } else {
        t = z;
      }
    } while (t > 1.37E-17);
    return sum;
  }

  /**
   * Compute the hypergeometric function <code>F(a,b,c;0;x)</code>.
   *
   * @param a parameter
   * @param b parameter
   * @param c parameter
   * @param x parameter
   * @return <code>F(a,b,c;0;x)</code>
   */
  public static double hypergeometric30(double a, double b, double c, final double x) {
    double a0 = 1;
    double sum = 1;
    double n = 1;
    double t;
    double max = 0;
    double conv = 1E38;
    double conv1 = conv;

    do {
      if (a == 0 || b == 0 || c == 0) {
        return sum;
      }
      if (a0 > 1E34 || n > 200) {
        return Double.NaN;
      }
      a0 *= (a++ * b++ * c++ * x) / n++;
      final double z = abs(a0);
      if (z > max) {
        max = z;
      } else if (z >= conv && z < max && z > conv1) {
        return sum;
      }
      conv1 = conv;
      conv = z;
      sum += a0;
      if (sum != 0) {
        t = abs(a0 / sum);
      } else {
        t = z;
      }
    } while (t > 1.37E-17);
    return sum;
  }
}

