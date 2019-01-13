package irvine.math.r;

import static irvine.math.r.Constants.MAXLOG;
import static irvine.math.r.Constants.SQRT_HALF;
import static irvine.math.r.PolyEval.p1eval;
import static irvine.math.r.PolyEval.polyeval;

/**
 * Various statistical functions.
 * @author Sean A. Irvine
 */
public final class Stats  {

  private Stats() { }

  private static final double[] ERFCN0 = {
    2.46196981473530512524E-10,
    5.64189564831068821977E-1,
    7.46321056442269912687E0,
    4.86371970985681366614E1,
    1.96520832956077098242E2,
    5.26445194995477358631E2,
    9.34528527171957607540E2,
    1.02755188689515710272E3,
    5.57535335369399327526E2
  };
  private static final double[] ERFCD0 = {
    1.32281951154744992508E1,
    8.67072140885989742329E1,
    3.54937778887819891062E2,
    9.75708501743205489753E2,
    1.82390916687909736289E3,
    2.24633760818710981792E3,
    1.65666309194161350182E3,
    5.57535340817727675546E2
  };
  private static final double[] ERFCN1 = {
    5.64189583547755073984E-1,
    1.27536670759978104416E0,
    5.01905042251180477414E0,
    6.16021097993053585195E0,
    7.40974269950448939160E0,
    2.97886665372100240670E0
  };
  private static final double[] ERFCD1 = {
    2.26052863220117276590E0,
    9.39603524938001434673E0,
    1.20489539808096656605E1,
    1.70814450747565897222E1,
    9.60896809063285878198E0,
    3.36907645100081516050E0
  };
  private static final double[] ERFN = {
    9.60497373987051638749E0,
    9.00260197203842689217E1,
    2.23200534594684319226E3,
    7.00332514112805075473E3,
    5.55923013010394962768E4
  };
  private static final double[] ERFD = {
    3.35617141647503099647E1,
    5.21357949780152679795E2,
    4.59432382970980127987E3,
    2.26290000613890934246E4,
    4.92673942608635921086E4
  };

  /**
   * Compute the complement of the error function, <code>erfc(x) = 1.0 - erf(x)</code>.
   * @param x parameter
   * @return <code>erfc(x)</code>
   */
  public static double erfc(final double x) {
    final double ax = Math.abs(x);
    if (ax < 1.0) {
      return 1.0 - erf(x);
    }
    double z = -x * x;
    if (z < -MAXLOG) {
      return x < 0 ? 2.0 : 0.0;
    }
    z = Math.exp(z);
    final double p;
    final double q;
    if (ax < 8.0) {
      p = polyeval(ax, ERFCN0);
      q = p1eval(ax, ERFCD0);
    } else {
      p = polyeval(ax, ERFCN1);
      q = p1eval(ax, ERFCD1);
    }
    double y = (z * p) / q;
    if (x < 0) {
      y = 2.0 - y;
    }
    return y == 0.0 ? (x < 0 ? 2.0 : 0.0) : y;
  }

  /**
   * Compute the error function, erf(x), of a double x where
   * erf(x) = {2/sqrt(pi)}\int_0^x e^(-t^2) dt. The magnitude of
   * x is limited to Math.log(Double.MAX_VALUE).
   * @param x parameter
   * @return erf(x)
   */
  public static double erf(final double x) {
    if (Math.abs(x) > 1.0) {
      return 1.0 - erfc(x);
    }
    final double z = x * x;
    return x * polyeval(z, ERFN) / p1eval(z, ERFD);
  }

  /**
   * Return the area under the normal distribution integrated from minus infinity to x.
   * @param x parameter
   * @return area from -infinity to x
   */
  public static double normal(double x) {
    x *= SQRT_HALF;
    final double z = Math.abs(x);
    if (z < SQRT_HALF) {
      return 0.5 + 0.5 * erf(x);
    }
    final double y = 0.5 * erfc(z);
    return x > 0.0 ? 1.0 - y : y;
  }

  private static final double[] INORMALN0 = {
    -5.99633501014107895267E1,
     9.80010754185999661536E1,
    -5.66762857469070293439E1,
     1.39312609387279679503E1,
    -1.23916583867381258016E0
  };
  private static final double[] INORMALD0 = {
     1.95448858338141759834E0,
     4.67627912898881538453E0,
     8.63602421390890590575E1,
    -2.25462687854119370527E2,
     2.00260212380060660359E2,
    -8.20372256168333339912E1,
     1.59056225126211695515E1,
    -1.18331621121330003142E0
  };
  private static final double[] INORMALN1 = {
     4.05544892305962419923E0,
     3.15251094599893866154E1,
     5.71628192246421288162E1,
     4.40805073893200834700E1,
     1.46849561928858024014E1,
     2.18663306850790267539E0,
    -1.40256079171354495875E-1,
    -3.50424626827848203418E-2,
    -8.57456785154685413611E-4
  };
  private static final double[] INORMALD1 = {
     1.57799883256466749731E1,
     4.53907635128879210584E1,
     4.13172038254672030440E1,
     1.50425385692907503408E1,
     2.50464946208309415979E0,
    -1.42182922854787788574E-1,
    -3.80806407691578277194E-2,
    -9.33259480895457427372E-4
  };
  private static final double[] INORMALN2 = {
    3.23774891776946035970E0,
    6.91522889068984211695E0,
    3.93881025292474443415E0,
    1.33303460815807542389E0,
    2.01485389549179081538E-1,
    1.23716634817820021358E-2,
    3.01581553508235416007E-4,
    2.65806974686737550832E-6,
    6.23974539184983293730E-9
  };
  private static final double[] INORMALD2 = {
    6.02427039364742014255E0,
    3.67983563856160859403E0,
    1.37702099489081330271E0,
    2.16236993594496635890E-1,
    1.34204006088543189037E-2,
    3.28014464682127739104E-4,
    2.89247864745380683936E-6,
    6.79019408009981274425E-9
  };

  private static final double INORMALC0 = Math.exp(-2);
  private static final double INORMALC1 = 1.0 - INORMALC0;

  /**
   * Return the value y such that the area under the normal curve from
   * -infinity to y is equal to x.
   * @param x parameter
   * @return the deviation giving area x
   */
  public static double inverseNormal(double x) {
    if (Double.isNaN(x)) {
      return x;
    } else if (x <= 0.0) {
      return Double.NEGATIVE_INFINITY; // empty region
    } else if (x >= 1.0) {
      return Double.POSITIVE_INFINITY; // entire region
    }
    boolean code = true;
    if (x > INORMALC1) {
      x = 1.0 - x;
      code = false;
    }
    if (x > INORMALC0) {
      x -= 0.5;
      final double x2 = x * x;
      return (x + x * (x2 * polyeval(x2, INORMALN0) / p1eval(x2, INORMALD0))) * Constants.SQRT_TAU;
    }
    double y = Math.sqrt(-2.0 * Math.log(x));
    final double y0 = y - Math.log(y) / y;
    final double z = 1.0 / y;
    if (y < 8.0) {
      y = z * polyeval(z, INORMALN1) / p1eval(z, INORMALD1);
    } else {
      y = z * polyeval(z, INORMALN2) / p1eval(z, INORMALD2);
    }
    return code ? y - y0 : y0 - y;
  }

  /**
   * Compute the area from zero to x under the beta density function:
   * P(x) = Gamma(a+b)/(Gamma(a)Gamma(b)) * \int_0^x t^{a-1}(1-t)^{b-1}dt.
   * @param a parameter
   * @param b parameter
   * @param x parameter
   * @return area from zero to x under beta distribution
   */
  public static double beta(final double a, final double b, final double x) {
    return Beta.ibeta(a, b, x);
  }

  /**
   * Compute the integral from zero to x under the gamma probability density function.
   * @param a parameter
   * @param b parameter
   * @param x parameter
   * @return <code>(a^b/Gamma(b))\int_0^x t^{b-1}e^{-at} dt</code>
   */
  public static double gamma(final double a, final double b, final double x) {
    return x < 0.0 ? Double.NaN : Gamma.incompletegamma(b, a * x);
  }

  /**
   * Compute the integral from x to infinity under the gamma probability density function.
   * @param a parameter
   * @param b parameter
   * @param x parameter
   * @return <code>(a^b/Gamma(b))\int_x^\infty t^{b-1}e^{-at} dt</code>
   */
  public static double gammacomplement(final double a, final double b, final double x) {
    return x < 0.0 ? Double.NaN : Gamma.incompletegammacomplement(b, a * x);
  }

  /**
   * Returns the area from 0 to x under the F density function (also known
   * as Snedcor's density or the variance ratio density). This is the density
   * of <code>x = (u1/df1)/(u2/df2)</code>, where <code>u1</code> and <code>
   * u2</code> are random variables having
   * chi-squared distributions with <code>df1</code> and <code>df2</code>
   * degrees of freedom, respectively.
   * @param df1 first degrees of freedom
   * @param df2 second degrees of freedom
   * @param x parameter
   * @return area from 0 to x under F density function
   */
  public static double fc(final int df1, final int df2, final double x) {
    if (df1 < 1 || df2 < 1 || x < 0.0) {
      return Double.NaN;
    }
    final double a = (double) df1;
    final double b = (double) df2;
    final double w = b / (b + a * x);
    return Beta.ibeta(0.5 * b, 0.5 * a, w);
  }

  /**
   * Return the area from x to infinity under the F density function (also
   * known as Snedcor's density or the variance ratio density).
   * @param df1 first degrees of freedom
   * @param df2 second degrees of freedom
   * @param x parameter
   * @return area from x to infinity under F density function
   */
  public static double f(final int df1, final int df2, final double x) {
    if (df1 < 1 || df2 < 1 || x < 0.0) {
      return Double.NaN;
    }
    final double a = (double) df1;
    final double b = (double) df2;
    double w = a * x;
    w = w / (b + w);
    return Beta.ibeta(0.5 * a, 0.5 * b, w);
  }

  /**
   * Finds the F density argument x such that the integral from x to infinity
   * of the F density is equal to the given probability p.
   * @param df1 first degrees of freedom
   * @param df2 second degrees of freedom
   * @param p probability
   * @return x value
   */
  public static double ifc(final int df1, final int df2, final double p) {
    if (df1 < 1 || df2 < 1 || p <= 0.0 || p > 1.0) {
      return Double.NaN;
    }
    final double a = (double) df1;
    final double b = (double) df2;
    double w = Beta.ibeta(0.5 * b, 0.5 * a, 0.5);
    if (w > p || p < 0.001) {
      w = Beta.inverseibeta(0.5 * b, 0.5 * a, p);
      return (b - b * w) / (a * w);
    } else {
      w = Beta.inverseibeta(0.5 * a, 0.5 * b, 1.0 - p);
      return b * w / (a * (1.0 - w));
    }
  }

  /**
   * Return the sum of the first k terms of the Poisson distribution.
   * @param k number of terms
   * @param m parameter
   * @return complemented Poisson value
   */
  public static double poisson(final int k, final double m) {
    return k < 0 || m <= 0.0 ? Double.NaN : Gamma.incompletegammacomplement((double) (k + 1), m);
  }

  /**
   * Return the 1.0 - sum of the first k terms of the Poisson distribution.
   * @param k number of terms
   * @param m parameter
   * @return complemented Poisson value
   */
  public static double poissoncomplement(final int k, final double m) {
    return k < 0 || m <= 0.0 ? Double.NaN : Gamma.incompletegamma((double) (k + 1), m);
  }

  /**
   * Finds the Poisson variable x such that the integral from 0 to x of the
   * Poisson density is equal to the given probability y.
   * @param k number of terms
   * @param y probability
   * @return integral limit
   */
  public static double inversepoisson(final int k, final double y) {
    return k < 0 || y < 0.0 || y >= 1.0 ? Double.NaN : Gamma.inverseigammacomplement((double) (k + 1), y);
  }

  /**
   * Returns the sum of the terms 0 through k of the Binomial probability
   * density: \sum_{j=0}^k{n \choose j}p^j(1-p)^{n-j}
   * @param k parameter
   * @param n parameter
   * @param p probability
   * @return binomial value
   */
  public static double binomial(final int k, final int n, final double p) {
    if (p < 0.0 || p > 1.0 || k < 0 || n < k) {
      return Double.NaN;
    } else if (k == n) {
      return 1.0;
    }
    final double dn = (double) (n - k);
    return k == 0 ? Math.pow(1.0 - p, dn) : Beta.ibeta(dn, (double) (k + 1), 1.0 - p);
  }

  /**
   * Returns the sum of the terms k+1 through n of the Binomial probability
   * density: \sum_{j=k+1}^n{n \choose j}p^j(1-p)^{n-j}
   * @param k parameter
   * @param n parameter
   * @param p probability
   * @return binomial value
   */
  public static double binomialcomplement(final int k, final int n, final double p) {
    if (p < 0.0 || p > 1.0 || n < k) {
      return Double.NaN;
    } else if (k < 0) {
      return 1.0;
    } else if (k == n) {
      return 0.0;
    }
    final double dn = (double) (n - k);
    if (k == 0) {
      if (p < 0.01) {
        return 1.0 - Math.exp(dn * Math.log(1.0 - p));
      } else {
        return 1.0 - Math.pow(1.0 - p, dn);
      }
    } else {
      return Beta.ibeta((double) (k + 1), dn, p);
    }
  }

  /**
   * Finds the event probability p such that the sum of the terms 0 through k of the
   * Binomial probability density is equal to the given cumulative probability y.
   * @param k parameter
   * @param n parameter
   * @param y parameter
   * @return probability
   */
  public static double inversebinomial(final int k, final int n, final double y) {
    if (y < 0.0 || y > 1.0 || k < 0 || n <= k) {
      return Double.NaN;
    }
    final double dn = (double) (n - k);
    if (k == 0) {
      return 1.0 - (y > 0.8 ? Math.exp(Math.log(y) / dn) : Math.pow(y, 1.0 / dn));
    } else {
      final double dk = (double) (k + 1);
      if (Beta.ibeta(dn, dk, 0.5) > 0.5) {
        return Beta.inverseibeta(dk, dn, 1.0 - y);
      } else {
        return 1.0 - Beta.inverseibeta(dn, dk, y);
      }
    }
  }

  /**
   * Returns the sum of the terms 0 through k of the negative binomial distribution:
   * \sum_{j=0}^k{n+j-1 \choose j}p^n(1-p)^j.
   * @param k parameter
   * @param n parameter
   * @param p probability
   * @return negative binomial value
   */
  public static double negativebinomial(final int k, final int n, final double p) {
    return p < 0.0 || p > 1.0 || k < 0 ? Double.NaN : Beta.ibeta((double) n, (double) (k + 1), p);
  }

  /**
   * Returns the sum of the terms k+1 through infinity of the negative binomial distribution:
   * \sum_{j=0}^k{n+j-1 \choose j}p^n(1-p)^j.
   * @param k parameter
   * @param n parameter
   * @param p probability
   * @return complemented negative binomial value
   */
  public static double negativebinomialcomplement(final int k, final int n, final double p) {
    return p < 0.0 || p > 1.0 || k < 0 ? Double.NaN : Beta.ibeta((double) (k + 1), (double) n, 1.0 - p);
  }

  /**
   * Functional inverse of negative binomial distribution.
   * @param k parameter
   * @param n parameter
   * @param p probability
   * @return inverse negative binomial value
   */
  public static double inversenegativebinomial(final int k, final int n, final double p) {
    return p < 0.0 || p > 1.0 || k < 0 ? Double.NaN : Beta.inverseibeta((double) n, (double) (k + 1), p);
  }

  /**
   * Compute probits.
   * @param p probability
   * @return probit
   */
  public static double probit(final double p) {
    final double pro;
    final double q = p - 0.5;
    if (Math.abs(q) <= 0.425) {
      final double r = 0.180625 - q * q;
      return q * (((5.9109374720E1 * r + 1.5929113202E2) * r + 5.0434271938E1) * r + 3.3871327179) / (((6.7187563600E1 * r + 7.8757757664E1) * r + 1.7895169469E1) * r + 1.0);
    } else {
      double r = q < 0.0 ? p : 1.0 - p;
      if (r <= 0.0) {
        throw new ArithmeticException("Cannot take probit of " + p);
      }
      r = Math.sqrt(-Math.log(r));
      if (r <= 5.0) {
        r -= 1.6;
        pro = (((1.7023821103E-1 * r + 1.3067284816) * r + 2.7568153900) * r + 1.4234372777) / ((1.2021132975E-1 * r + 7.3700164250E-1) * r + 1.0);
      } else {
        r -= 5.0;
        pro = (((1.7337203997E-2 * r + 4.2868294337E-1) * r + 3.0812263860) * r + 6.6579051150) / ((1.2258202635E-2 * r + 2.4197894225E-1) * r + 1.0);
      }
    }
    return q < 0.0 ? -pro : pro;
  }
}
