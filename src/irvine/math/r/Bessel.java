package irvine.math.r;

import static irvine.math.r.Constants.QUARTER_PI;
import static irvine.math.r.Constants.SQRT2_DIV_PI;
import static irvine.math.r.Constants.THREE_PI_DIV4;
import static irvine.math.r.Constants.TWO_DIV_PI;
import static irvine.math.r.PolyEval.chebyshev;
import static irvine.math.r.PolyEval.p1eval;
import static irvine.math.r.PolyEval.polyeval;

/**
 * Various Bessel functions.
 *
 * @author Sean A. Irvine
 */
public final class Bessel {

  private Bessel() { }

  private static final double[] I0A = {
    -4.41534164647933937950E-18,
     3.33079451882223809783E-17,
    -2.43127984654795469359E-16,
     1.71539128555513303061E-15,
    -1.16853328779934516808E-14,
     7.67618549860493561688E-14,
    -4.85644678311192946090E-13,
     2.95505266312963983461E-12,
    -1.72682629144155570723E-11,
     9.67580903537323691224E-11,
    -5.18979560163526290666E-10,
     2.65982372468238665035E-9,
    -1.30002500998624804212E-8,
     6.04699502254191894932E-8,
    -2.67079385394061173391E-7,
     1.11738753912010371815E-6,
    -4.41673835845875056359E-6,
     1.64484480707288970893E-5,
    -5.75419501008210370398E-5,
     1.88502885095841655729E-4,
    -5.76375574538582365885E-4,
     1.63947561694133579842E-3,
    -4.32430999505057594430E-3,
     1.05464603945949983183E-2,
    -2.37374148058994688156E-2,
     4.93052842396707084878E-2,
    -9.49010970480476444210E-2,
     1.71620901522208775349E-1,
    -3.04682672343198398683E-1,
     6.76795274409476084995E-1
  };

  private static final double[] I0B = {
    -7.23318048787475395456E-18,
    -4.83050448594418207126E-18,
     4.46562142029675999901E-17,
     3.46122286769746109310E-17,
    -2.82762398051658348494E-16,
    -3.42548561967721913462E-16,
     1.77256013305652638360E-15,
     3.81168066935262242075E-15,
    -9.55484669882830764870E-15,
    -4.15056934728722208663E-14,
     1.54008621752140982691E-14,
     3.85277838274214270114E-13,
     7.18012445138366623367E-13,
    -1.79417853150680611778E-12,
    -1.32158118404477131188E-11,
    -3.14991652796324136454E-11,
     1.18891471078464383424E-11,
     4.94060238822496958910E-10,
     3.39623202570838634515E-9,
     2.26666899049817806459E-8,
     2.04891858946906374183E-7,
     2.89137052083475648297E-6,
     6.88975834691682398426E-5,
     3.36911647825569408990E-3,
     8.04490411014108831608E-1
  };


  /**
   * Compute the value of the Bessel function i_0(x) = j_0(ix) for
   * real x.
   *
   * @param x parameter
   * @return i_0(x)
   */
  public static double i0(double x) {
    if (Double.isNaN(x)) {
      return x;
    }
    x = Math.abs(x);
    if (x == Double.POSITIVE_INFINITY) {
      return x;
    }
    if (x <= 8) {
      return Math.exp(x) * chebyshev((x / 2) - 2, I0A);
    }
    return Math.exp(x) * chebyshev(32 / x - 2, I0B) / Math.sqrt(x);
  }

  /**
   * Compute the value of the Bessel function <code>i_0(x) = j_0(ix)</code>
   * scaled by <code>exp(-|x|)</code> for a given real value x.
   *
   * @param x parameter
   * @return <code>i_0(x) * exp(-|x|)</code>
   */
  public static double i0exp(double x) {
    if (Double.isNaN(x)) {
      return x;
    }
    x = Math.abs(x);
    if (x == Double.POSITIVE_INFINITY) {
      return x;
    }
    if (x <= 8) {
      return chebyshev((x / 2) - 2, I0A);
    }
    return chebyshev(32 / x - 2, I0B) / Math.sqrt(x);
  }


  // array for i1 computation
  private static final double[] I1A = {
     2.77791411276104639959E-18,
    -2.11142121435816608115E-17,
     1.55363195773620046921E-16,
    -1.10559694773538630805E-15,
     7.60068429473540693410E-15,
    -5.04218550472791168711E-14,
     3.22379336594557470981E-13,
    -1.98397439776494371520E-12,
     1.17361862988909016308E-11,
    -6.66348972350202774223E-11,
     3.62559028155211703701E-10,
    -1.88724975172282928790E-9,
     9.38153738649577178388E-9,
    -4.44505912879632808065E-8,
     2.00329475355213526229E-7,
    -8.56872026469545474066E-7,
     3.47025130813767847674E-6,
    -1.32731636560394358279E-5,
     4.78156510755005422638E-5,
    -1.61760815825896745588E-4,
     5.12285956168575772895E-4,
    -1.51357245063125314899E-3,
     4.15642294431288815669E-3,
    -1.05640848946261981558E-2,
     2.47264490306265168283E-2,
    -5.29459812080949914269E-2,
     1.02643658689847095384E-1,
    -1.76416518357834055153E-1,
     2.52587186443633654823E-1
  };

  private static final double[] I1B = {
    7.51729631084210481353E-18,
    4.41434832307170791151E-18,
   -4.65030536848935832153E-17,
   -3.20952592199342395980E-17,
    2.96262899764595013876E-16,
    3.30820231092092828324E-16,
   -1.88035477551078244854E-15,
   -3.81440307243700780478E-15,
    1.04202769841288027642E-14,
    4.27244001671195135429E-14,
   -2.10154184277266431302E-14,
   -4.08355111109219731823E-13,
   -7.19855177624590851209E-13,
    2.03562854414708950722E-12,
    1.41258074366137813316E-11,
    3.25260358301548823856E-11,
   -1.89749581235054123450E-11,
   -5.58974346219658380687E-10,
   -3.83538038596423702205E-9,
   -2.63146884688951950684E-8,
   -2.51223623787020892529E-7,
   -3.88256480887769039346E-6,
   -1.10588938762623716291E-4,
   -9.76109749136146840777E-3,
    7.78576235018280120474E-1
  };


  /**
   * Compute the value of the Bessel function i_1(x) = j_1(ix) for
   * real x.
   *
   * @param x parameter
   * @return i_1(x)
   */
  public static double i1(final double x) {
    if (Double.isNaN(x)) {
      return x;
    }
    double z = Math.abs(x);
    if (z == Double.POSITIVE_INFINITY) {
      return z;
    }
    if (z <= 8) {
      z = chebyshev(z / 2 - 2, I1A) * z * Math.exp(z);
    } else {
      z = Math.exp(z) * chebyshev(32 / z - 2, I1B) / Math.sqrt(z);
    }
    if (x < 0) {
      z = -z;
    }
    return z;
  }

  /**
   * Compute the value of the Bessel function <code>i_1(x) = j_1(ix)</code>
   * scaled by <code>exp(-|x|)</code> for a given real value x.
   *
   * @param x parameter
   * @return <code>i_1(x) * exp(-|x|)</code>
   */
  public static double i1exp(final double x) {
    if (Double.isNaN(x)) {
      return x;
    }
    double z = Math.abs(x);
    if (z == Double.POSITIVE_INFINITY) {
      return z;
    }
    if (z <= 8) {
      z = chebyshev(z / 2 - 2, I1A) * z;
    } else {
      z = chebyshev(32 / z - 2, I1B) / Math.sqrt(z);
    }
    if (x < 0) {
      z = -z;
    }
    return z;
  }


  /**
   * Compute the modified Bessel function of order v at x. If x is negative
   * then v must be integer valued. The function is defined as I_v(x)=J_v(ix).
   * The function is computed via the confluent hypergeometric function.
   *
   * @param v parameter
   * @param x parameter
   * @return I_v(x)
   */
  public static double i(double v, final double x) {
    // if v is a negative integer, invoke symmetry
    double t = Math.floor(v);
    if (v < 0 && t == v) {
      v = -v;
      t = -t;
    }
    int sign = 1;
    if (x < 0) {
      if (t != v) {
        return Double.NaN;
      }
      if (v != 2 * Math.floor(v / 2)) {
        sign = -1;
      }
    } else if (x == 0) {
      // avoid logarithm singularity
      if (v == 0) {
        return 1;
      }
      if (v < 0) {
        return Double.POSITIVE_INFINITY;
      }
      return 0;
    }
    double ax = Math.abs(x);
    t = v * Math.log(0.5 * ax) - x;
    t = sign * Math.exp(t) / Gamma.gamma(v + 1);
    ax = v + 0.5;
    return t * Hypergeometric.hypergeometric(ax, 2 * ax, 2 * x);
  }

  /**
   * Compute the Bessel function J_0(x) of order zero.
   *
   * @param x parameter
   * @return J_0(x)
   */
  public static double j0(final double x) {
    return BesselJ.j0(x);
  }

  // Arrays for computation of y0
  private static final double[] YP = {
    1.55924367855235737965E4,
   -1.46639295903971606143E7,
    5.43526477051876500413E9,
   -9.82136065717911466409E11,
    8.75906394395366999549E13,
   -3.46628303384729719441E15,
    4.42733268572569800351E16,
   -1.84950800436986690637E16,
  };

  private static final double[] YQ = {
    1.04128353664259848412E3,
    6.26107330137134956842E5,
    2.68919633393814121987E8,
    8.64002487103935000337E10,
    2.02979612750105546709E13,
    3.17157752842975028269E15,
    2.50596256172653059228E17,
  };

  /**
   * Compute the zeroth order Bessel function of the second kind, Y_0(x)
   *
   * @param x parameter
   * @return Y_0(x)
   */
  public static double y0(final double x) {
    if (x <= 5) {
      if (x <= 0) {
        return Double.NaN;
      }
      final double z = x * x;
      return polyeval(z, YP) / p1eval(z, YQ) + TWO_DIV_PI * Math.log(x) * j0(x);
    }
    final double w = 5 / x;
    final double z = 25 / (x * x);
    final double p = polyeval(z, BesselJ.J0PP) / polyeval(z, BesselJ.J0PQ);
    final double q = polyeval(z, BesselJ.J0QP) / p1eval(z, BesselJ.J0QQ);
    final double xn = x - QUARTER_PI;
    return (p * Math.sin(xn) + w * q * Math.cos(xn)) * SQRT2_DIV_PI / Math.sqrt(x);
  }

  private static final double[] J1RP = {
   -8.99971225705559398224E8,
    4.52228297998194034323E11,
   -7.27494245221818276015E13,
    3.68295732863852883286E15,
  };

  private static final double[] J1RQ = {
    6.20836478118054335476E2,
    2.56987256757748830383E5,
    8.35146791431949253037E7,
    2.21511595479792499675E10,
    4.74914122079991414898E12,
    7.84369607876235854894E14,
    8.95222336184627338078E16,
    5.32278620332680085395E18,
  };

  private static final double[] J1PP = {
    7.62125616208173112003E-4,
    7.31397056940917570436E-2,
    1.12719608129684925192E0,
    5.11207951146807644818E0,
    8.42404590141772420927E0,
    5.21451598682361504063E0,
    1.00000000000000000254E0,
  };

  private static final double[] J1PQ = {
    5.71323128072548699714E-4,
    6.88455908754495404082E-2,
    1.10514232634061696926E0,
    5.07386386128601488557E0,
    8.39985554327604159757E0,
    5.20982848682361821619E0,
    9.99999999999999997461E-1,
  };

  private static final double[] J1QP = {
    5.10862594750176621635E-2,
    4.98213872951233449420E0,
    7.58238284132545283818E1,
    3.66779609360150777800E2,
    7.10856304998926107277E2,
    5.97489612400613639965E2,
    2.11688757100572135698E2,
    2.52070205858023719784E1,
  };

  private static final double[] J1QQ = {
    7.42373277035675149943E1,
    1.05644886038262816351E3,
    4.98641058337653607651E3,
    9.56231892404756170795E3,
    7.99704160447350683650E3,
    2.82619278517639096600E3,
    3.36093607810698293419E2,
  };

  /**
   * Compute the Bessel function of order 1, J_1(x).
   *
   * @param x parameter
   * @return J_1(x)
   */
  public static double j1(final double x) {
    double w = x;
    if (x < 0) {
      w = -x;
    }
    double z = x * x;
    if (w <= 5) {
      return (polyeval(z, J1RP) / p1eval(z, J1RQ)) * x * (z - 1.46819706421238932572E1) * (z - 4.92184563216946036703E1);
    }
    final double r = 5 / w;
    z = r * r;
    final double p = polyeval(z, J1PP) / polyeval(z, J1PQ);
    final double q = polyeval(z, J1QP) / p1eval(z, J1QQ);
    final double xn = w - THREE_PI_DIV4;
    z = (p * Math.cos(xn) - r * q * Math.sin(xn)) * SQRT2_DIV_PI / Math.sqrt(w);
    return x < 0 ? -z : z;
  }

  // arrays for y1 computation
  private static final double[] Y1P = {
    1.26320474790178026440E9,
   -6.47355876379160291031E11,
    1.14509511541823727583E14,
   -8.12770255501325109621E15,
    2.02439475713594898196E17,
   -7.78877196265950026825E17,
  };

  private static final double[] Y1Q = {
    5.94301592346128195359E2,
    2.35564092943068577943E5,
    7.34811944459721705660E7,
    1.87601316108706159478E10,
    3.88231277496238566008E12,
    6.20557727146953693363E14,
    6.87141087355300489866E16,
    3.97270608116560655612E18,
  };


  /**
   * Compute the first order Bessel function of the second kind, Y_1(x).
   *
   * @param x parameter
   * @return Y_1(x)
   */
  public static double y1(final double x) {
    if (x <= 5) {
      if (x <= 0) {
        return Double.NaN;
      }
      final double z = x * x;
      return x * (polyeval(z, Y1P) / p1eval(z, Y1Q)) + TWO_DIV_PI * (j1(x) * Math.log(x) - 1 / x);
    }
    final double w = 5 / x;
    final double r = w * w;
    final double p = polyeval(r, J1PP) / polyeval(r, J1PQ);
    final double q = polyeval(r, J1QP) / p1eval(r, J1QQ);
    final double xn = x - THREE_PI_DIV4;
    return (p * Math.sin(xn) + w * q * Math.cos(xn)) * SQRT2_DIV_PI / Math.sqrt(x);
  }


  /**
   * Compute the Bessel function at integer order n.
   *
   * @param n parameter
   * @param x parameter
   * @return J_n(x)
   */
  public static double j(final double n, final double x) {
    return BesselJ.j(n, x);
  }

  /**
   * Compute the Bessel function of the second kind at integer order.
   *
   * @param n order
   * @param x parameter
   * @return Y_n(x)
   */
  public static double y(int n, final double x) {

    if (n == 0) {
      return y0(x);
    }
    final int sign;
    if (n < 0) {
      n = -n;
      sign = (n & 1) == 0 ? 1 : -1;
    } else {
      sign = 1;
    }
    if (n == 1) {
      return sign * y1(x);
    }
    // test for overflow
    if (x <= 0) {
      return Double.NaN;
    }
    double anm2 = y0(x);
    double anm1 = y1(x);
    int k = 1;
    double r = 2 * k;
    double an;
    do {
      an = r * anm1 / x - anm2;
      anm2 = anm1;
      anm1 = an;
      r += 2;
    } while (++k < n);

    return sign * an;
  }

  /**
   * Compute the Bessel function Y_v(x) for real v.
   *
   * @param v parameter
   * @param x parameter
   * @return Y_v(x)
   */
  public static double y(final double v, final double x) {
    final double n = Math.floor(v);
    if (n == v) {
      return y((int) n, x);
    }
    final double t = Math.PI * v;
    return (Math.cos(t) * j(v, x) - j(-v, x)) / Math.sin(t);
  }

  /**
   * Compute the modified Bessel function of the third kind of order zero
   * at the specified point.
   *
   * @param x parameter
   * @return K_0(x)
   */
  public static double k0(final double x) {
    return BesselK.k0(x);
  }

  /**
   * Compute the exponentially scaled modified Bessel function of the third kind
   * of order zero at the specified point.
   *
   * @param x parameter
   * @return K_0(x) * exp(x)
   */
  public static double k0exp(final double x) {
    return BesselK.k0exp(x);
  }

  /**
   * Compute the modified Bessel function of the third kind, order one,
   * at the specified position.
   *
   * @param x parameter
   * @return K_1(x)
   */
  public static double k1(final double x) {
    return BesselK.k1(x);
  }

  /**
   * Compute the exponentially scaled modified Bessel function of the
   * third kind, order one, at the specified position.
   *
   * @param x parameter
   * @return K_1(x) * exp(x)
   */
  public static double k1exp(final double x) {
    return BesselK.k1exp(x);
  }


  /**
   * Compute the modified Bessel function of the third kind at the
   * specified integer order.
   *
   * @param n order
   * @param x parameter
   * @return K_n(x)
   */
  public static double k(final int n, final double x) {
    return BesselK.k(n, x);
  }
}
