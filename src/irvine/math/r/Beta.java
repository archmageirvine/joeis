package irvine.math.r;

import static irvine.math.r.Constants.MACHINE_PRECISION;
import static irvine.math.r.Constants.MAXLOG;
import static irvine.math.r.Constants.MINLOG;
import static irvine.math.r.Gamma.MAXGAMMA;
import static irvine.math.r.Gamma.gamma;
import static irvine.math.r.Gamma.lgamma;
import static irvine.math.r.Gamma.lgammaSign;
import static irvine.math.r.Stats.inverseNormal;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Double.isNaN;
import static java.lang.Math.abs;
import static java.lang.Math.exp;
import static java.lang.Math.floor;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * Beta functions.
 *
 * @author Sean A. Irvine
 */
public final class Beta {

  private Beta() { }

  /**
   * Compute the beta function of two doubles.
   *
   * @param a first parameter
   * @param b second parameter
   * @return gamma(a)gamma(b)/gamma(a+b)
   */
  public static double beta(final double a, final double b) {
    if (isNaN(a)) {
      return a;
    }
    if (isNaN(b)) {
      return b;
    }
    if (a <= 0 && a == floor(a)) {
      return NaN;
    }
    if (b <= 0 && b == floor(b)) {
      return NaN;
    }
    double y = a + b;
    if (abs(y) > MAXGAMMA) {
      int s = 1;
      final int osign = lgammaSign(); // save the sign
      y = lgamma(y);
      s *= lgammaSign();
      y = lgamma(b) - y;
      s *= lgammaSign();
      y += lgamma(a);
      s *= lgammaSign();
      Gamma.sLGammaSign = osign; // replace the sign
      return y > MAXLOG ? s * POSITIVE_INFINITY : s * exp(y);
    }
    y = gamma(y);
    return y == 0 ? POSITIVE_INFINITY : a > b ? (gamma(a) / y) * gamma(b) : (gamma(b) / y) * gamma(a);
  }

  // power series for incomplete beta used when b*x is small and x not
  // too close to 1
  private static double ibetaPowerSeries(final double a, final double b, final double x) {
    final double ai = 1 / a;
    final double z = MACHINE_PRECISION * ai;
    double u = (1 - b) * x;
    double t = u;
    double v = u / (a + 1);
    final double vv = v;
    double n = 2;
    double s = 0;
    while (abs(v) > z) {
      u = (n - b) * x / n;
      t *= u;
      v = t / (a + n++);
      s += v;
    }
    s += vv;
    s += ai;
    u = a * log(x);
    if (a + b < MAXGAMMA && abs(u) < MAXLOG) {
      t = gamma(a + b) / (gamma(a) * gamma(b));
      s = s * t * pow(x, a);
    } else {
      t = lgamma(a + b) - lgamma(a) - lgamma(b) + u + log(s);
      s = t < MINLOG ? 0 : exp(t);
    }
    return s;
  }

  // constants used in continued fraction expansions
  private static final double BETABIG = 4.503599627370496E15;
  private static final double BETABIGINV = 2.22044604925031308085E-16;

  // continued fraction expansion for incomplete beta
  private static double ibetacf(final double a, final double b, final double x) {
    double k1 = a;
    double k2 = a + b;
    double k3 = a;
    double k4 = a + 1;
    double k5 = 1;
    double k6 = b - 1;
    double k7 = k4;
    double k8 = a + 2;
    double pkm2 = 0;
    double qkm2 = 1;
    double pkm1 = 1;
    double qkm1 = 1;
    double ans = 1;
    double r = 1;
    final double thres = 3 * MACHINE_PRECISION;
    double xk, pk, qk, t;
    int n = 0;
    do {
      xk = -(x * k1 * k2) / (k3 * k4);
      pk = pkm1 + pkm2 * xk;
      qk = qkm1 + qkm2 * xk;
      pkm2 = pkm1;
      pkm1 = pk;
      qkm2 = qkm1;
      qkm1 = qk;
      xk = (x * k5 * k6) / (k7 * k8);
      pk = pkm1 + pkm2 * xk;
      qk = qkm1 + qkm2 * xk;
      pkm2 = pkm1;
      pkm1 = pk;
      qkm2 = qkm1;
      qkm1 = qk;
      if (qk != 0) {
        r = pk / qk;
      }
      if (r != 0) {
        t = abs((ans - r) / r);
        ans = r;
      } else {
        t = 1;
      }
      if (t < thres) {
        return ans;
      }
      ++k1;
      ++k2;
      k3 += 2;
      k4 += 2;
      ++k5;
      --k6;
      k7 += 2;
      k8 += 2;
      if (abs(qk) + abs(pk) > BETABIG) {
        pkm2 *= BETABIGINV;
        pkm1 *= BETABIGINV;
        qkm2 *= BETABIGINV;
        qkm1 *= BETABIGINV;
      }
      if (abs(qk) < BETABIGINV || abs(pk) < BETABIGINV) {
        pkm2 *= BETABIG;
        pkm1 *= BETABIG;
        qkm2 *= BETABIG;
        qkm1 *= BETABIG;
      }
    } while (++n < 300);
    return ans;
  }

  // different continued fraction expansion for incomplete beta
  private static double ibetad(final double a, final double b, final double x) {
    double k1 = a;
    double k2 = b - 1;
    double k3 = a;
    double k4 = a + 1;
    double k5 = 1;
    double k6 = a + b;
    double k7 = a + 1;
    double k8 = a + 2;
    double pkm2 = 0;
    double qkm2 = 1;
    double pkm1 = 1;
    double qkm1 = 1;
    final double z = x / (1 - x);
    double ans = 1;
    double r = 1;
    final double thres = 3 * MACHINE_PRECISION;
    double xk, pk, qk, t;
    int n = 0;
    do {
      xk = -(z * k1 * k2) / (k3 * k4);
      pk = pkm1 + pkm2 * xk;
      qk = qkm1 + qkm2 * xk;
      pkm2 = pkm1;
      pkm1 = pk;
      qkm2 = qkm1;
      qkm1 = qk;
      xk = (z * k5 * k6) / (k7 * k8);
      pk = pkm1 + pkm2 * xk;
      qk = qkm1 + qkm2 * xk;
      pkm2 = pkm1;
      pkm1 = pk;
      qkm2 = qkm1;
      qkm1 = qk;
      if (qk != 0) {
        r = pk / qk;
      }
      if (r != 0) {
        t = abs((ans - r) / r);
        ans = r;
      } else {
        t = 1;
      }
      if (t < thres) {
        return ans;
      }
      ++k1;
      --k2;
      k3 += 2;
      k4 += 2;
      ++k5;
      ++k6;
      k7 += 2;
      k8 += 2;
      if (abs(qk) + abs(pk) > BETABIG) {
        pkm2 *= BETABIGINV;
        pkm1 *= BETABIGINV;
        qkm2 *= BETABIGINV;
        qkm1 *= BETABIGINV;
      }
      if (abs(qk) < BETABIGINV || abs(pk) < BETABIGINV) {
        pkm2 *= BETABIG;
        pkm1 *= BETABIG;
        qkm2 *= BETABIG;
        qkm1 *= BETABIG;
      }
    } while (++n < 300);
    return ans;
  }

  /**
   * Compute the incomplete beta integral defined by
   * <code>ibeta(a,b,x) = (Gamma(a+b)/(Gamma(a)Gamma(b)) * int_0^x t^{a-1}(1-t)^{b-1}dt</code>.
   * It is defined for 0 &lt;= x &lt;= 1 and in this implementation a and b are
   * restricted to be positive values.
   *
   * @param a first parameter
   * @param b second parameter
   * @param x argument
   * @return <code>ibeta(a,b,x)</code>
   */
  public static strictfp double ibeta(final double a, final double b, final double x) {
    if (a <= 0) {
      return NaN;
    }
    if (b <= 0) {
      return NaN;
    }
    if (x == 0) {
      return 0;
    }
    if (x == 1) {
      return 1;
    }
    if (x < 0) {
      return NaN;
    }
    if (x > 1) {
      return NaN;
    }
    if (b * x <= 1 && x <= 0.95) {
      return ibetaPowerSeries(a, b, x);
    }
    final double aa, bb, xc, xx;
    final boolean reversed = x > (a / (a + b));
    // if x is greater than the mean reverse a and b
    if (reversed) {
      aa = b;
      bb = a;
      xc = x;
      xx = 1 - x;
      if (bb * xx <= 1 && xx <= 0.95) {
        final double t = ibetaPowerSeries(aa, bb, xx);
        return 1 - (t <= MACHINE_PRECISION ? MACHINE_PRECISION : t);
      }
    } else {
      aa = a;
      bb = b;
      xc = 1 - x;
      xx = x;
    }
    // choose expansion for better convergence
    final double w = xx * (aa + bb - 2) - (aa - 1) < 0 ? ibetacf(aa, bb, xx) : ibetad(aa, bb, xx) / xc;
    final double q = aa * log(xx);
    double t = bb * log(xc);
    if (aa + bb < MAXGAMMA && abs(q) < MAXLOG && abs(t) < MAXLOG) {
      t = pow(xc, bb);
      t *= pow(xx, aa);
      t /= aa;
      t *= w;
      t *= gamma(aa + bb) / (gamma(aa) * gamma(bb));
      if (reversed) {
        return 1 - (t <= MACHINE_PRECISION ? MACHINE_PRECISION : t);
      }
      return t;
    }
    // use logarithmic approximation
    final double y = q + t + lgamma(aa + bb) - lgamma(aa) - lgamma(bb) + log(w / aa);
    final double o = y < MINLOG ? 0 : exp(y);
    return reversed ? 1 - (o <= MACHINE_PRECISION ? MACHINE_PRECISION : o) : o;
  }

  /**
   * Compute the inverse of the incomplete beta integral. Given x it
   * finds a y such that <code>ibeta(a,b,y)=x</code>.
   *
   * @param aa a value
   * @param bb b value
   * @param yy0 y value
   * @return x such that <code>ibeta(a,b,x)=y</code>
   */
  public static strictfp double inverseibeta(final double aa, final double bb, final double yy0) {
    if (yy0 <= 0) {
      return 0;
    }
    if (yy0 >= 1) {
      return 1;
    }
    double dithresh, y, x, a, b, y0;
    boolean rflg = false, newt = false;
    if (aa <= 1 || bb <= 1) {
      dithresh = 1E-6;
      a = aa;
      b = bb;
      y0 = yy0;
      x = a / (a + b);
      y = ibeta(a, b, x);
    } else {
      final double yp;
      rflg = yy0 > 0.5;
      if (rflg) {
        a = bb;
        b = aa;
        y0 = 1 - yy0;
        yp = inverseNormal(yy0);
      } else {
        a = aa;
        b = bb;
        y0 = yy0;
        yp = -inverseNormal(yy0);
      }
      final double l = (yp * yp - 3) / 6;
      final double xx = 2 / (1 / (2 * a - 1) + 1 / (2 * b - 1));
      final double d = (yp * sqrt(xx + l) / xx - (1 / (2 * b - 1) - 1 / (2 * a - 1)) * (l + 5 / 6 - 2 / (3 * xx))) * 2;
      if (d < MINLOG) {
        return rflg ? 1 : 0;
      }
      x = a / (a + b * exp(d));
      y = ibeta(a, b, x);
      newt = abs((y - y0) / y0) < 0.2;
      dithresh = 1E-4;
    }
    double x0 = 0, yl = 0, x1 = 1, yh = 1;
    boolean nflg = false;
    ihalve: // Resort to interval halving if not close enough.
    while (true) {
      if (newt) {
        if (nflg) {
          return rflg ? 1 - (x <= MACHINE_PRECISION ? MACHINE_PRECISION : x) : x;
        }
        nflg = true;
        final double lgm = lgamma(a + b) - lgamma(a) - lgamma(b);
        for (int i = 0; i < 8; ++i) {
          // Compute the function at this point.
          if (i != 0) {
            y = ibeta(a, b, x);
          }
          if (y < yl) {
            x = x0;
            y = yl;
          } else if (y > yh) {
            x = x1;
            y = yh;
          } else if (y < y0) {
            x0 = x;
            yl = y;
          } else {
            x1 = x;
            yh = y;
          }
          if (x == 1 || x == 0) {
            break;
          }
          // Compute the derivative of the function at this point.
          double d = (a - 1) * log(x) + (b - 1) * log(1 - x) + lgm;
          if (d < MINLOG) {
            return rflg ? 1 - (x <= MACHINE_PRECISION ? MACHINE_PRECISION : x) : x;
          } else if (d > MAXLOG) {
            break;
          }
          d = (y - y0) / exp(d);
          double xt = x - d;
          if (xt <= x0) {
            y = (x - x0) / (x1 - x0);
            xt = x0 + 0.5 * y * (x - x0);
            if (xt <= 0) {
              break;
            }
          }
          if (xt >= x1) {
            y = (x1 - x) / (x1 - x0);
            xt = x1 - 0.5 * y * (x1 - x);
            if (xt >= 1) {
              break;
            }
          }
          x = xt;
          if (abs(d / x) < 128 * MACHINE_PRECISION) {
            return rflg ? 1 - (x <= MACHINE_PRECISION ? MACHINE_PRECISION : x) : x;
          }
        }
        // Did not converge.
        dithresh = 256 * MACHINE_PRECISION;
        newt = false;
      }
      int dir = 0;
      double di = 0.5;
      for (int i = 0; i < 100; ++i) {
        if (i != 0) {
          x = x0 + di * (x1 - x0);
          if (x == 1) {
            x = 1 - MACHINE_PRECISION;
          } else if (x == 0) {
            di = 0.5;
            x = x0 + di * (x1 - x0);
            if (x == 0) {
              return rflg ? 1 : 0;
            }
          }
          y = ibeta(a, b, x);
          if (abs((x1 - x0) / (x1 + x0)) < dithresh || abs((y - y0) / y0) < dithresh) {
            newt = true;
            continue ihalve;
          }
        }
        if (y < y0) {
          x0 = x;
          yl = y;
          if (dir < 0) {
            dir = 0;
            di = 0.5;
          } else {
            di = dir > 3 ? 1 - (1 - di) * (1 - di) : (dir > 1 ? 0.5 * di + 0.5 : (y0 - y) / (yh - yl));
          }
          ++dir;
          if (x0 > 0.75) {
            if (rflg) {
              a = aa;
              b = bb;
              y0 = yy0;
            } else {
              a = bb;
              b = aa;
              y0 = 1 - yy0;
            }
            rflg ^= true;
            x = 1 - x;
            y = ibeta(a, b, x);
            x0 = 0;
            yl = 0;
            x1 = 1;
            yh = 1;
            continue ihalve;
          }
        } else {
          x1 = x;
          if (rflg && x1 < MACHINE_PRECISION) {
            return 1 - MACHINE_PRECISION;
          }
          yh = y;
          if (dir > 0) {
            dir = 0;
            di = 0.5;
          } else {
            di = dir < -3 ? di * di : (dir < -1 ? 0.5 * di : (y - y0) / (yh - yl));
          }
          --dir;
        }
      }
      if (x0 >= 1) {
        x = 1 - MACHINE_PRECISION;
        return rflg ? 1 - (x <= MACHINE_PRECISION ? MACHINE_PRECISION : x) : x;
      } else if (x <= 0) {
        return rflg ? 1 : 0;
      }
      newt = true;
    }
  }

}
