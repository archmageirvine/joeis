package irvine.math.r;

import static irvine.math.r.Constants.MACHINE_PRECISION;
import static irvine.math.r.Gamma.gamma;
import static irvine.math.r.PolyEval.p1eval;
import static irvine.math.r.PolyEval.polyeval;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.PI;
import static java.lang.Math.abs;
import static java.lang.Math.exp;
import static java.lang.Math.floor;
import static java.lang.Math.pow;
import static java.lang.Math.sin;

/**
 * Zeta functions.
 *
 * @author Sean A. Irvine
 */
public final class Zeta {

  private Zeta() { }

  // array for zeta function computation
  private static final double[] ZETA = {
          12,
        -720,
       30240,
    -1209600,
    47900160,
          -1.8924375803183791606E9,
           7.47242496E10,
          -2.950130727918164224E12,
           1.1646782814350067249E14,
          -4.5979787224074726105E15,
           1.8152105401943546773E17,
          -7.1661652561756670113E18
  };


  /**
   * Compute the Riemann zeta function of two arguments.
   * zeta(x,q) = \sum_{k=0}^\infty (k+q)^-x. This is not a
   * full analytic computation and the result is NaN for
   * x &lt; 1.
   *
   * @param x parameter
   * @param q parameter
   * @return zeta(x,q)
   */
  public static double zeta(final double x, final double q) {
    if (x == 1) {
      return POSITIVE_INFINITY;
    }
    if (x < 1) {
      return NaN;
    }
    if (q <= 0) {
      if (q == floor(q)) {
        return POSITIVE_INFINITY;
      }
      if (x != floor(x)) {
        return 0;
      }
    }
    // Euler-Maclaurin summation
    double b = 0;
    int i = 0;
    double s = pow(q, -x);
    double a = q;
    while (i < 9 || a <= 9) {
      ++i;
      b = pow(++a, -x);
      s += b;
      if (abs(b / s) < MACHINE_PRECISION) {
        return s;
      }
    }
    final double w = a;
    s += b * w / (x - 1) - 0.5 * b;
    a = 1;
    double k = 0;
    for (final double z : ZETA) {
      a *= x + k++;
      b /= w;
      final double t = a * b / z;
      s += t;
      if (abs(t / s) < MACHINE_PRECISION) {
        return s;
      }
      a *= x + k++;
      b /= w;
    }
    return s;
  }


  // arrays for computation of zetaComplement
  private static final double[] ZETAC = {
   -1.50000000000000000000E0,
    POSITIVE_INFINITY,
    6.44934066848226436472E-1,
    2.02056903159594285400E-1,
    8.23232337111381915160E-2,
    3.69277551433699263314E-2,
    1.73430619844491397145E-2,
    8.34927738192282683980E-3,
    4.07735619794433937869E-3,
    2.00839282608221441785E-3,
    9.94575127818085337146E-4,
    4.94188604119464558702E-4,
    2.46086553308048298638E-4,
    1.22713347578489146752E-4,
    6.12481350587048292585E-5,
    3.05882363070204935517E-5,
    1.52822594086518717326E-5,
    7.63719763789976227360E-6,
    3.81729326499983985646E-6,
    1.90821271655393892566E-6,
    9.53962033872796113152E-7,
    4.76932986787806463117E-7,
    2.38450502727732990004E-7,
    1.19219925965311073068E-7,
    5.96081890512594796124E-8,
    2.98035035146522801861E-8,
    1.49015548283650412347E-8,
    7.45071178983542949198E-9,
    3.72533402478845705482E-9,
    1.86265972351304900640E-9,
    9.31327432419668182872E-10
  };

  private static final double[] ZETACP = {
    5.85746514569725319540E11,
    2.57534127756102572888E11,
    4.87781159567948256438E10,
    5.15399538023885770696E9,
    3.41646073514754094281E8,
    1.60837006880656492731E7,
    5.92785467342109522998E5,
    1.51129169964938823117E4,
    2.01822444485997955865E2,
  };

  private static final double[] ZETACQ = {
    3.90497676373371157516E11,
    5.22858235368272161797E10,
    5.64451517271280543351E9,
    3.39006746015350418834E8,
    1.79410371500126453702E7,
    5.66666825131384797029E5,
    1.60382976810944131506E4,
    1.96436237223387314144E2,
  };

  private static final double[] ZETACA = {
    8.70728567484590192539E6,
    1.76506865670346462757E8,
    2.60889506707483264896E10,
    5.29806374009894791647E11,
    2.26888156119238241487E13,
    3.31884402932705083599E14,
    5.13778997975868230192E15,
   -1.98123688133907171455E15,
   -9.92763810039983572356E16,
    7.82905376180870586444E16,
    9.26786275768927717187E16,
  };

  private static final double[] ZETACB = {
    -7.92625410563741062861E6,
    -1.60529969932920229676E8,
    -2.37669260975543221788E10,
    -4.80319584350455169857E11,
    -2.07820961754173320170E13,
    -2.96075404507272223680E14,
    -4.86299103694609136686E15,
     5.34589509675789930199E15,
     5.71464111092297631292E16,
    -1.79915597658676556828E16,
  };

  private static final double[] ZETACR = {
    -3.28717474506562731748E-1,
     1.55162528742623950834E1,
    -2.48762831680821954401E2,
     1.01050368053237678329E3,
     1.26726061410235149405E4,
    -1.11578094770515181334E5,
  };

  private static final double[] ZETACS = {
    1.95107674914060531512E1,
    3.17710311750646984099E2,
    3.03835500874445748734E3,
    2.03665876435770579345E4,
    7.43853965136767874343E4,
  };

  /**
   * Compute the complement of the Riemann zeta function; that is
   * <code>zetaComplement(x) = \sum_{k=2}^\infty k^{-x}</code> where x &gt; 1.
   * It is related to the zeta function by <code>zetaComplement(x) = zeta(x)
   * - 1</code>. Extension of the function for x &lt; 1 is implemented.
   *
   * @param x parameter
   * @return <code>zetaComplement(x)</code>
   */
  public static double zetaComplement(final double x) {
    if (x < 0) {
      if (x < -30.8148) {
        return NaN;
      }
      final double s = 1 - x;
      return sin(Constants.HALF_PI * x) * pow(Constants.TAU, x) * gamma(s) * (1 + zetaComplement(s)) / PI - 1;
    }
    if (x >= 127) {
      return 0;
    }
    // use tabulated values for small integer arguments
    if (floor(x) == x && x < 31) {
      return ZETAC[(int) x];
    }
    if (x < 1) {
      return polyeval(x, ZETACR) / ((1 - x) * p1eval(x, ZETACS));
    }
    if (x <= 10) {
      final double w = 1 / x;
      return (x * polyeval(w, ZETACP)) / ((pow(2, x) * (x - 1)) * p1eval(w, ZETACQ));
    }
    if (x <= 50) {
      return exp(polyeval(x, ZETACA) / p1eval(x, ZETACB)) + pow(2, -x);
    }
    // sum of inverse powers
    double b;
    double s = 0;
    double a = 1;
    do {
      a += 2;
      b = pow(a, -x);
      s += b;
    } while (b / s > MACHINE_PRECISION);
    b = pow(2, -x);
    return (s + b) / (1 - b);
  }

}
