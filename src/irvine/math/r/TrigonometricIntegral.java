package irvine.math.r;

import static irvine.math.r.Constants.EULER;
import static irvine.math.r.Constants.MACHINE_PRECISION;
import static irvine.math.r.Constants.HALF_PI;
import static irvine.math.r.PolyEval.chebyshev;
import static irvine.math.r.PolyEval.p1eval;
import static irvine.math.r.PolyEval.polyeval;
import static java.lang.Double.NEGATIVE_INFINITY;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Double.isNaN;
import static java.lang.Math.abs;
import static java.lang.Math.cos;
import static java.lang.Math.exp;
import static java.lang.Math.log;
import static java.lang.Math.sin;

/**
 * Provides standard integrals of trigonometric functions and hyperbolic
 * functions.
 *
 * @author Sean A. Irvine
 */
public final class TrigonometricIntegral {

  private TrigonometricIntegral() { }

  // Arrays for Si and Ci computation
  private static final double[] SICISN = {
    -8.39167827910303881427E-11,
     4.62591714427012837309E-8,
    -9.75759303843632795789E-6,
     9.76945438170435310816E-4,
    -4.13470316229406538752E-2,
     1.00000000000000000302E0
  };

  private static final double[] SICISD = {
    2.03269266195951942049E-12,
    1.27997891179943299903E-9,
    4.41827842801218905784E-7,
    9.96412122043875552487E-5,
    1.42085239326149893930E-2,
    9.99999999999999996984E-1,
  };

  private static final double[] SICICN = {
     2.02524002389102268789E-11,
    -1.35249504915790756375E-8,
     3.59325051419993077021E-6,
    -4.74007206873407909465E-4,
     2.89159652607555242092E-2,
    -1.00000000000000000080E0
  };

  private static final double[] SICICD = {
    4.07746040061880559506E-12,
    3.06780997581887812692E-9,
    1.23210355685883423679E-6,
    3.17442024775032769882E-4,
    5.10028056236446052392E-2,
    4.00000000000000000080E0
  };

  private static final double[] SICIFN4 = {
    4.23612862892216586994E0,
    5.45937717161812843388E0,
    1.62083287701538329132E0,
    1.67006611831323023771E-1,
    6.81020132472518137426E-3,
    1.08936580650328664411E-4,
    5.48900223421373614008E-7
  };

  private static final double[] SICIFD4 = {
    8.16496634205391016773E0,
    7.30828822505564552187E0,
    1.86792257950184183883E0,
    1.78792052963149907262E-1,
    7.01710668322789753610E-3,
    1.10034357153915731354E-4,
    5.48900252756255700982E-7
  };

  private static final double[] SICIFN8 = {
    4.55880873470465315206E-1,
    7.13715274100146711374E-1,
    1.60300158222319456320E-1,
    1.16064229408124407915E-2,
    3.49556442447859055605E-4,
    4.86215430826454749482E-6,
    3.20092790091004902806E-8,
    9.41779576128512936592E-11,
    9.70507110881952024631E-14
  };

  private static final double[] SICIFD8 = {
    9.17463611873684053703E-1,
    1.78685545332074536321E-1,
    1.22253594771971293032E-2,
    3.58696481881851580297E-4,
    4.92435064317881464393E-6,
    3.21956939101046018377E-8,
    9.43720590350276732376E-11,
    9.70507110881952025725E-14
  };

  private static final double[] SICIGN4 = {
    8.71001698973114191777E-2,
    6.11379109952219284151E-1,
    3.97180296392337498885E-1,
    7.48527737628469092119E-2,
    5.38868681462177273157E-3,
    1.61999794598934024525E-4,
    1.97963874140963632189E-6,
    7.82579040744090311069E-9
  };

  private static final double[] SICIGD4 = {
    1.64402202413355338886E0,
    6.66296701268987968381E-1,
    9.88771761277688796203E-2,
    6.22396345441768420760E-3,
    1.73221081474177119497E-4,
    2.02659182086343991969E-6,
    7.82579218933534490868E-9
  };

  private static final double[] SICIGN8 = {
    6.97359953443276214934E-1,
    3.30410979305632063225E-1,
    3.84878767649974295920E-2,
    1.71718239052347903558E-3,
    3.48941165502279436777E-5,
    3.47131167084116673800E-7,
    1.70404452782044526189E-9,
    3.85945925430276600453E-12,
    3.14040098946363334640E-15
  };

  private static final double[] SICIGD8 = {
    1.68548898811011640017E0,
    4.87852258695304967486E-1,
    4.67913194259625806320E-2,
    1.90284426674399523638E-3,
    3.68475504442561108162E-5,
    3.57043223443740838771E-7,
    1.72693748966316146736E-9,
    3.87830166023954706752E-12,
    3.14040098946363335242E-15
  };

  /**
   * Compute the sine integral of a double. That is, the integral
   * <code>Si(x) = \int_0^x{\sin t\over t} dt</code>.
   *
   * The integral is approximated by rational functions. For x &gt; 8
   * auxiliary functions f(x) and g(x) are employed such that
   * <code>Si(x) = pi/2 - f(x)\cos x - g(x)\sin x</code>.
   *
   * @param x parameter
   * @return Si(x)
   */
  public static double si(final double x) {
    if (isNaN(x)) {
      return x;
    }
    if (x == 0) {
      return 0;
    }
    if (x == POSITIVE_INFINITY) {
      return HALF_PI;
    }
    final double s, a = abs(x);
    if (a > 1E9) {
      s = HALF_PI - cos(a) / a;
    } else {
      final double z = a * a;
      if (a <= 4) {
        s = a * polyeval(z, SICISN) / polyeval(z, SICISD);
      } else {
        final double f, g, y = 1 / z;
        if (a < 8) {
          f = polyeval(y, SICIFN4) / (a * p1eval(y, SICIFD4));
          g = y * polyeval(y, SICIGN4) / p1eval(y, SICIGD4);
        } else {
          f = polyeval(y, SICIFN8) / (a * p1eval(y, SICIFD8));
          g = y * polyeval(y, SICIGN8) / p1eval(y, SICIGD8);
        }
        s = HALF_PI - f * cos(a) - g * sin(a);
      }
    }
    return x < 0 ? -s : s;
  }

  /**
   * Compute the cosine integral of a double. That is, the integral
   * <code>Ci(x) = euler + \ln x + \int_0^x{\cos t-1\over t} dt</code>.
   *
   * The integral is approximated by rational functions. For x &gt; 8
   * auxiliary functions f(x) and g(x) are employed such that
   * <code>Ci(x) = f(x)\sin x - g(x)\cos x</code>.
   *
   * @param x parameter
   * @return Ci(x)
   */
  public static double ci(final double x) {
    if (isNaN(x)) {
      return x;
    }
    if (x == 0) {
      return NEGATIVE_INFINITY;
    }
    if (x > 1E9) {
      return sin(x) / x;
    }
    final double z = x * x;
    if (x <= 4) {
      return EULER + log(x) + z * polyeval(z, SICICN) / polyeval(z, SICICD);
    }
    final double f, g, y = 1 / z;
    if (x < 8) {
      f = polyeval(y, SICIFN4) / (x * p1eval(y, SICIFD4));
      g = y * polyeval(y, SICIGN4) / p1eval(y, SICIGD4);
    } else {
      f = polyeval(y, SICIFN8) / (x * p1eval(y, SICIFD8));
      g = y * polyeval(y, SICIGN8) / p1eval(y, SICIGD8);
    }
    return f * sin(x) - g * cos(x);
  }

  /* arrays for Shi computation */
  private static final double[] SHI1 = {
    1.83889230173399459482E-17,
   -9.55485532279655569575E-17,
    2.04326105980879882648E-16,
    1.09896949074905343022E-15,
   -1.31313534344092599234E-14,
    5.93976226264314278932E-14,
   -3.47197010497749154755E-14,
   -1.40059764613117131000E-12,
    9.49044626224223543299E-12,
   -1.61596181145435454033E-11,
   -1.77899784436430310321E-10,
    1.35455469767246947469E-9,
   -1.03257121792819495123E-9,
   -3.56699611114982536845E-8,
    1.44818877384267342057E-7,
    7.82018215184051295296E-7,
   -5.39919118403805073710E-6,
   -3.12458202168959833422E-5,
    8.90136741950727517826E-5,
    2.02558474743846862168E-3,
    2.96064440855633256972E-2,
    1.11847751047257036625E0
  };

  private static final double[] SHI2 = {
   -1.05311574154850938805E-17,
    2.62446095596355225821E-17,
    8.82090135625368160657E-17,
   -3.38459811878103047136E-16,
   -8.30608026366935789136E-16,
    3.93397875437050071776E-15,
    1.01765565969729044505E-14,
   -4.21128170307640802703E-14,
   -1.60818204519802480035E-13,
    3.34714954175994481761E-13,
    2.72600352129153073807E-12,
    1.66894954752839083608E-12,
   -3.49278141024730899554E-11,
   -1.58580661666482709598E-10,
   -1.79289437183355633342E-10,
    1.76281629144264523277E-9,
    1.69050228879421288846E-8,
    1.25391771228487041649E-7,
    1.16229947068677338732E-6,
    1.61038260117376323993E-5,
    3.49810375601053973070E-4,
    1.28478065259647610779E-2,
    1.03665722588798326712E0
   };

  /**
   * Compute the hyperbolic sine integral of a double. That is, the
   * integral Shi(x) = \int_0^x{\sinh t / t} dt.
   *
   * The integral is approximated by a power series.
   *
   * @param x parameter
   * @return Shi(x)
   */
  public static double shi(final double x) {
    if (isNaN(x)) {
      return x;
    }
    if (x == 0) {
      return 0;
    }
    final double a = abs(x);
    if (a < 8) {
      // power series expansion
      final double z = a * a;
      double d = 1;
      double s = 1;
      double k = 2;
      do {
        d *= z / k++;
        d /= k;
        s += d / k++;
      } while (abs(d / s) > MACHINE_PRECISION);
      s *= a;
      return x < 0 ? -s : s;
    }
    if (a <= 88) {
      final double s, r = exp(a) / a;
      if (a < 18) {
        s = r * chebyshev((576 / a - 52) / 10, SHI1);
      } else {
        s = r * chebyshev((6336 / a - 212) / 70, SHI2);
      }
      return x < 0 ? -s : s;
    }
    return x < 0 ? NEGATIVE_INFINITY : POSITIVE_INFINITY;
  }

  /* arrays used in Chi computation */
  private static final double[] CHI1 = {
    -8.12435385225864036372E-18,
     2.17586413290339214377E-17,
     5.22624394924072204667E-17,
    -9.48812110591690559363E-16,
     5.35546311647465209166E-15,
    -1.21009970113732918701E-14,
    -6.00865178553447437951E-14,
     7.16339649156028587775E-13,
    -2.93496072607599856104E-12,
    -1.40359438136491256904E-12,
     8.76302288609054966081E-11,
    -4.40092476213282340617E-10,
    -1.87992075640569295479E-10,
     1.31458150989474594064E-8,
    -4.75513930924765465590E-8,
    -2.21775018801848880741E-7,
     1.94635531373272490962E-6,
     4.33505889257316408893E-6,
    -6.13387001076494349496E-5,
    -3.13085477492997465138E-4,
     4.97164789823116062801E-4,
     2.64347496031374526641E-2,
     1.11446150876699213025E0
  };

  private static final double[] CHI2 = {
      8.06913408255155572081E-18,
     -2.08074168180148170312E-17,
     -5.98111329658272336816E-17,
      2.68533951085945765591E-16,
      4.52313941698904694774E-16,
     -3.10734917335299464535E-15,
     -4.42823207332531972288E-15,
      3.49639695410806959872E-14,
      6.63406731718911586609E-14,
     -3.71902448093119218395E-13,
     -1.27135418132338309016E-12,
      2.74851141935315395333E-12,
      2.33781843985453438400E-11,
      2.71436006377612442764E-11,
     -2.56600180000355990529E-10,
     -1.61021375163803438552E-9,
     -4.72543064876271773512E-9,
     -3.00095178028681682282E-9,
      7.79387474390914922337E-8,
      1.06942765566401507066E-6,
      1.59503164802313196374E-5,
      3.49592575153777996871E-4,
      1.28475387530065247392E-2,
      1.03665693917934275131E0
  };

  /**
   * Compute the hyperbolic cosine integral of a double. That is, the
   * integral Chi(x) = \int_0^x{(\cosh t - 1)/ t} dt.
   *
   * The integral is approximated by a power series.
   *
   * @param x parameter
   * @return Chi(x)
   */
  public static double chi(final double x) {
    if (isNaN(x)) {
      return x;
    }
    if (x == 0) {
      return NEGATIVE_INFINITY;
    }
    if (x < 0) {
      return NaN;
    }
    if (x < 8) {
      // power series expansion
      final double z = x * x;
      double a = 1;
      double c = 0;
      double k = 2;
      do {
        a *= z / k;
        c += a / k++;
        a /= k++;
      } while (abs(a / c) > MACHINE_PRECISION);
      return EULER + log(x) + c;
    }
    if (x <= 88) {
      return EULER + log(x) + (exp(x) / x) * (x < 18 ? chebyshev((576 / x - 52) / 10, CHI1) : chebyshev((6336 / x - 212) / 70, CHI2));
    }
    return POSITIVE_INFINITY;
  }

}
