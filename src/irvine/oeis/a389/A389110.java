package irvine.oeis.a389;

import irvine.math.r.Reals;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A389110 allocated for Pablo Cadena-Urz\u00faa.
 * @author Sean A. Irvine
 */
public class A389110 extends Sequence1 implements Conjectural {

  // Conjectural due to use of floating-point

  private static final int MAX_ITER = 200;
  private static final double EPS = 3e-14;
  private static final double FPMIN = 1e-300;
  private int mN = 0;

  private static double logGamma(final double x) {
    return Reals.SINGLETON.lnGamma(x);
  }

  // --- continued fraction for incomplete beta (Numerical Recipes) ---
  private static double betacf(final double x, final double a, final double b) {
    final double qab = a + b;
    final double qap = a + 1.0;
    final double qam = a - 1.0;
    double c = 1.0;
    double d = 1.0 - qab * x / qap;
    if (Math.abs(d) < FPMIN) {
      d = FPMIN;
    }
    d = 1.0 / d;
    double h = d;

    for (int m = 1; m <= MAX_ITER; ++m) {
      final int m2 = 2 * m;
      double aa = m * (b - m) * x / ((qam + m2) * (a + m2));
      d = 1.0 + aa * d;
      if (Math.abs(d) < FPMIN) {
        d = FPMIN;
      }
      c = 1.0 + aa / c;
      if (Math.abs(c) < FPMIN) {
        c = FPMIN;
      }
      d = 1.0 / d;
      h *= d * c;
      aa = -(a + m) * (qab + m) * x / ((a + m2) * (qap + m2));
      d = 1.0 + aa * d;
      if (Math.abs(d) < FPMIN) {
        d = FPMIN;
      }
      c = 1.0 + aa / c;
      if (Math.abs(c) < FPMIN) {
        c = FPMIN;
      }
      d = 1.0 / d;
      final double del = d * c;
      h *= del;
      if (Math.abs(del - 1.0) < EPS) {
        break;
      }
    }
    return h;
  }

  private static double regularizedBeta(final double x, final double a, final double b) {
    if (x <= 0.0) {
      return 0.0;
    }
    if (x >= 1.0) {
      return 1.0;
    }
    final double bt = Math.exp(logGamma(a + b) - logGamma(a) - logGamma(b) + a * Math.log(x) + b * Math.log(1.0 - x));
    if (x < (a + 1.0) / (a + b + 2.0)) {
      return bt * betacf(x, a, b) / a;
    } else {
      return 1.0 - bt * betacf(1.0 - x, b, a) / b;
    }
  }

  private static double inverseRegularizedBeta(final double p, final double a, final double b) {
    if (p <= 0.0) {
      return 0.0;
    }
    if (p >= 1.0) {
      return 1.0;
    }
    double xLow = 0.0;
    double xHigh = 1.0;
    double xMid = 0.5;
    for (int k = 0; k < 100; ++k) {
      xMid = 0.5 * (xLow + xHigh);
      final double f = regularizedBeta(xMid, a, b);
      if (f > p) {
        xHigh = xMid;
      } else {
        xLow = xMid;
      }
      if (xHigh - xLow < EPS) {
        break;
      }
    }
    return xMid;
  }

  private static double cpL(final int m, final int k) {
    if (k == 0) {
      return 0.0;
    }
    return inverseRegularizedBeta(0.025, k, m - k + 1.0);
  }

  private static double cpU(final int m, final int k) {
    if (k == m) {
      return 1.0;
    }
    return inverseRegularizedBeta(0.975, k + 1.0, m - k);
  }

  private static double cpWidth(final int m) {
    double maxWidth = 0.0;
    for (int k = 0; k <= m; ++k) {
      final double width = cpU(m, k) - cpL(m, k);
      if (width > maxWidth) {
        maxWidth = width;
      }
    }
    return maxWidth;
  }

  private static final double Z975 = 1.959963984540054; // norm.ppf(0.975)  = sqrt(2) * ierf(95/100)

  private static int ncc(final int n) {
    final double val = 4.0 / Math.pow(-Z975 + Math.sqrt(Z975 * Z975 + 4.0 / n), 2);
    return (int) Math.ceil(val);
  }

  @Override
  public Z next() {
    ++mN;
    int m = ncc(mN);
    while (cpWidth(m) > 1.0 / mN) {
      ++m;
    }
    while (m > 1 && cpWidth(m - 1) <= 1.0 / mN) {
      --m;
    }
    return Z.valueOf(m);
  }
}
