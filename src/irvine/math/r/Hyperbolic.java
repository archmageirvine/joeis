package irvine.math.r;

import static irvine.math.r.Constants.LN2;
import static irvine.math.r.PolyEval.p1eval;
import static irvine.math.r.PolyEval.polyeval;
import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.abs;
import static java.lang.Math.log;
import static java.lang.Math.sqrt;

/**
 * Hyperbolic trigonometric functions. Functions included are the hyperbolic
 * sine, hyperbolic cosine, hyperbolic tangent, and their inverses.
 *
 * @author Sean A. Irvine
 */
public final class Hyperbolic {

  private Hyperbolic() { }

  private static final double[] ASINHN = {
    -4.33231683752342103572E-3,
    -5.91750212056387121207E-1,
    -4.37390226194356683570E0,
    -9.09030533308377316566E0,
    -5.56682227230859640450E0
  };

  private static final double[] ASINHD = {
    1.28757002067426453537E1,
    4.86042483805291788324E1,
    6.95722521337257608734E1,
    3.34009336338516356383E1
  };

  /**
   * Compute the inverse hyperbolic sine of a number.
   *
   * @param x parameter
   * @return sinh^{-1}(x)
   */
  public static double asinh(final double x) {
    final double s, ax = abs(x);
    if (ax > 1E8) {
      s = ax == POSITIVE_INFINITY ? ax : log(ax) + LN2;
    } else if (ax >= 0.5) {
      s = log(ax + sqrt(ax * ax + 1));
    } else {
      final double z = ax * ax;
      s = ax + ax * z * (polyeval(z, ASINHN) / p1eval(z, ASINHD));
    }
    return x < 0 ? -s : s;
  }

  // Arrays for acosh computation
  private static final double[] ACOSHN = {
    1.18801130533544501356E2,
    3.94726656571334401102E3,
    3.43989375926195455866E4,
    1.08102874834699867335E5,
    1.10855947270161294369E5
  };

  private static final double[] ACOSHD = {
    1.86145380837903397292E2,
    4.15352677227719831579E3,
    2.97683430363289370382E4,
    8.29725251988426222434E4,
    7.83869920495893927727E4
  };

  /**
   * Compute the inverse hyperbolic cosine of a number.  Returns NaN
   * for <code>x &lt; 1</code>.
   *
   * @param x parameter
   * @return cosh^{-1}(x)
   */
  public static double acosh(final double x) {
    if (x > 1E8) {
      return x == POSITIVE_INFINITY ? POSITIVE_INFINITY : log(x) + LN2;
    }
    final double z = x - 1;
    if (z < 0.5) {
      return sqrt(z) * (polyeval(z, ACOSHN) / p1eval(z, ACOSHD));
    }
    return log(x + sqrt(z * (x + 1)));
  }

  // Arrays for atanh computation
  private static final double[] ATANHN = {
    -8.54074331929669305196E-1,
     1.20426861384072379242E1,
    -4.61252884198732692637E1,
     6.54566728676544377376E1,
    -3.09092539379866942570E1
  };

  private static final double[] ATANHD = {
    -1.95638849376911654834E1,
     1.08938092147140262656E2,
    -2.49839401325893582852E2,
     2.52006675691344555838E2,
    -9.27277618139601130017E1
  };

  /**
   * Compute the inverse hyperbolic tangent of a number.
   *
   * @param x parameter
   * @return tanh^{-1}(x)
   */
  public static double atanh(final double x) {
    final double z = abs(x);
    if (z >= 1) {
      if (x == 1) {
        return POSITIVE_INFINITY;
      }
      if (x == -1) {
        return NEGATIVE_INFINITY;
      }
      return NaN;
    }
    if (z < 1E-7) {
      return x;
    }
    if (z < 0.5) {
      final double s = x * x;
      return x + x * s * (polyeval(s, ATANHN) / p1eval(s, ATANHD));
    }
    return 0.5 * log((1 + x) / (1 - x));
  }

}
