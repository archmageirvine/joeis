package irvine.math.r;

import static irvine.math.r.Constants.INV_LN10;
import static irvine.math.r.Constants.INV_LN2;
import static irvine.math.r.PolyEval.polyeval;
import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.NaN;
import static java.lang.Math.PI;
import static java.lang.Math.log;

/**
 * Logarithm functions.
 *
 * @author Sean A. Irvine
 */
public final class Logarithm {

  private Logarithm() { }

  /**
   * Compute the base 2 logarithm of a double
   *
   * @param x parameter
   * @return lg(x)
   */
  public static double lg(final double x) {
    return INV_LN2 * log(x);
  }

  /**
   * Compute the base 10 logarithm of a double
   *
   * @param x parameter
   * @return log10(x)
   */
  public static double log10(final double x) {
    return INV_LN10 * log(x);
  }

  /* arrays for dilogarithm computation */
  private static final double[] DILOGN = {
    4.65128586073990045278E-5,
    7.31589045238094711071E-3,
    1.33847639578309018650E-1,
    8.79691311754530315341E-1,
    2.71149851196553469920E0,
    4.25697156008121755724E0,
    3.29771340985225106936E0,
    1.00000000000000000126E0
  };

  private static final double[] DILOGD = {
    6.90990488912553276999E-4,
    2.54043763932544379113E-2,
    2.82974860602568089943E-1,
    1.41172597751831069617E0,
    3.63800533345137075418E0,
    5.03278880143316990390E0,
    3.54771340985225096217E0,
    9.99999999999999998740E-1
  };

  private static final double PISQR6 = PI * PI / 6;

  /**
   * Compute the dilogarithm of x where <code>dilog(x)=\int_0^x(ln(1-t)/t)dt</code>. Note that
   * slightly different definitions of the dilogarithm function sometimes appear
   * in the literature.
   *
   * @param x parameter
   * @return the dilogarithm of <code>x</code>
   */
  public static double dilog(double x) {
    if (x > 1) {
      return NaN;
    }
    if (x == 0) {
      return 0;
    }
    if (x == 1) {
      return PISQR6;
    }
    if (x == NEGATIVE_INFINITY) {
      return x;
    }
    x = 1 - x;
    int flag = 0;
    if (x > 2) {
      x = 1 / x;
      flag = 2;
    }
    final double w;
    if (x > 1.5) {
      w = 1 / x - 1;
      flag = 2;
    } else if (x < 0.5) {
      w = -x;
      flag |= 1;
    } else {
      w = x - 1;
    }
    double y = -w * polyeval(w, DILOGN) / polyeval(w, DILOGD);
    if ((flag & 1) == 1) {
      y = PISQR6 - log(x) * log(1 - x) - y;
    }
    if (flag > 1) {
      final double z = log(x);
      y = -0.5 * z * z - y;
    }
    return y;
  }

}
