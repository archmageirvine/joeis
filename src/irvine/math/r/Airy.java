package irvine.math.r;

import static irvine.math.r.Constants.INV_SQRT_PI;
import static irvine.math.r.Constants.MACHINE_PRECISION;
import static irvine.math.r.Constants.QUARTER_PI;
import static irvine.math.r.Constants.SQRT3;
import static irvine.math.r.PolyEval.p1eval;
import static irvine.math.r.PolyEval.polyeval;
import static java.lang.Double.POSITIVE_INFINITY;
import static java.lang.Math.abs;
import static java.lang.Math.cos;
import static java.lang.Math.exp;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;

/**
 * Airy functions.
 *
 * @author Sean A. Irvine
 */
public final class Airy {

  private Airy() { }

  // Arrays for Airy function computation
  private static final double[] AIRYAN = {
    3.46538101525629032477E-1,
    1.20075952739645805542E1,
    7.62796053615234516538E1,
    1.68089224934630576269E2,
    1.59756391350164413639E2,
    7.05360906840444183113E1,
    1.40264691163389668864E1,
    9.99999999999999995305E-1
  };

  private static final double[] AIRYAD = {
    5.67594532638770212846E-1,
    1.47562562584847203173E1,
    8.45138970141474626562E1,
    1.77318088145400459522E2,
    1.64234692871529701831E2,
    7.14778400825575695274E1,
    1.40959135607834029598E1,
    1.00000000000000000470E0
  };

  private static final double[] AIRYAPN = {
    6.13759184814035759225E-1,
    1.47454670787755323881E1,
    8.20584123476060982430E1,
    1.71184781360976385540E2,
    1.59317847137141783523E2,
    6.99778599330103016170E1,
    1.39470856980481566958E1,
    1.00000000000000000550E0
  };

  private static final double[] AIRYAPD = {
    3.34203677749736953049E-1,
    1.11810297306158156705E1,
    7.11727352147859965283E1,
    1.58778084372838313640E2,
    1.53206427475809220834E2,
    6.86752304592780337944E1,
    1.38498634758259442477E1,
    9.99999999999999994502E-1
  };

  private static final double[] AIRYBN = {
    -2.53240795869364152689E-1,
     5.75285167332467384228E-1,
    -3.29907036873225371650E-1,
     6.44404068948199951727E-2,
    -3.82519546641336734394E-3
  };

  private static final double[] AIRYBD = {
    -7.15685095054035237902E0,
     1.06039580715664694291E1,
    -5.23246636471251500874E0,
     9.57395864378383833152E-1,
    -5.50828147163549611107E-2
  };

  private static final double[] AIRYBPPN = {
     4.65461162774651610328E-1,
    -1.08992173800493920734E0,
     6.38800117371827987759E-1,
    -1.26844349553102907034E-1,
     7.62487844342109852105E-3
  };

  private static final double[] AIRYBPPD = {
    -8.70622787633159124240E0,
     1.38993162704553213172E1,
    -7.14116144616431159572E0,
     1.34008595960680518666E0,
    -7.84273211323341930448E-2
  };

  private static final double[] AIRYAFN = {
    -1.31696323418331795333E-1,
    -6.26456544431912369773E-1,
    -6.93158036036933542233E-1,
    -2.79779981545119124951E-1,
    -4.91900132609500318020E-2,
    -4.06265923594885404393E-3,
    -1.59276496239262096340E-4,
    -2.77649108155232920844E-6,
    -1.67787698489114633780E-8
  };

  private static final double[] AIRYAFD = {
    1.33560420706553243746E1,
    3.26825032795224613948E1,
    2.67367040941499554804E1,
    9.18707402907259625840E0,
    1.47529146771666414581E0,
    1.15687173795188044134E-1,
    4.40291641615211203805E-3,
    7.54720348287414296618E-5,
    4.51850092970580378464E-7
  };

  private static final double[] AIRYAGN = {
    1.97339932091685679179E-2,
    3.91103029615688277255E-1,
    1.06579897599595591108E0,
    9.39169229816650230044E-1,
    3.51465656105547619242E-1,
    6.33888919628925490927E-2,
    5.85804113048388458567E-3,
    2.82851600836737019778E-4,
    6.98793669997260967291E-6,
    8.11789239554389293311E-8,
    3.41551784765923618484E-10
  };

  private static final double[] AIRYAGD = {
    9.30892908077441974853E0,
    1.98352928718312140417E1,
    1.55646628932864612953E1,
    5.47686069422975497931E0,
    9.54293611618961883998E-1,
    8.64580826352392193095E-2,
    4.12656523824222607191E-3,
    1.01259085116509135510E-4,
    1.17166733214413521882E-6,
    4.91834570062930015649E-9
  };

  private static final double[] AIRYAPFN = {
    1.85365624022535566142E-1,
    8.86712188052584095637E-1,
    9.87391981747398547272E-1,
    4.01241082318003734092E-1,
    7.10304926289631174579E-2,
    5.90618657995661810071E-3,
    2.33051409401776799569E-4,
    4.08718778289035454598E-6,
    2.48379932900442457853E-8
  };

  private static final double[] AIRYAPFD = {
    1.47345854687502542552E1,
    3.75423933435489594466E1,
    3.14657751203046424330E1,
    1.09969125207298778536E1,
    1.78885054766999417817E0,
    1.41733275753662636873E-1,
    5.44066067017226003627E-3,
    9.39421290654511171663E-5,
    5.65978713036027009243E-7
  };

  private static final double[] AIRYAPGN = {
    -3.55615429033082288335E-2,
    -6.37311518129435504426E-1,
    -1.70856738884312371053E0,
    -1.50221872117316635393E0,
    -5.63606665822102676611E-1,
    -1.02101031120216891789E-1,
    -9.48396695961445269093E-3,
    -4.60325307486780994357E-4,
    -1.14300836484517375919E-5,
    -1.33415518685547420648E-7,
    -5.63803833958893494476E-10
  };

  private static final double[] AIRYAPGD = {
    9.85865801696130355144E0,
    2.16401867356585941885E1,
    1.73130776389749389525E1,
    6.17872175280828766327E0,
    1.08848694396321495475E0,
    9.95005543440888479402E-2,
    4.78468199683886610842E-3,
    1.18159633322838625562E-4,
    1.37480673554219441465E-6,
    5.79912514929147598821E-9
  };

  private static final double AIRYC1 = 0.35502805388781723926;
  private static final double AIRYC2 = 0.258819403792806798405;

  /** Compute Airy for x &lt; -2.09. */
  private static double[] negativeAiry(final double x) {
    final double[] result = new double[4];
    final double snx = sqrt(-x);
    final double zeta = -2 * x * snx / 3;
    final double t = sqrt(snx);
    final double theta = zeta + QUARTER_PI;
    final double f = sin(theta);
    final double g = cos(theta);
    final double z = 1 / zeta;
    final double zz = z * z;
    final double fu = 1 + zz * polyeval(zz, AIRYAFN) / p1eval(zz, AIRYAFD);
    final double gu = z * polyeval(zz, AIRYAGN) / p1eval(zz, AIRYAGD);
    final double k = INV_SQRT_PI / t;
    result[0] = k * (f * fu - g * gu);
    result[2] = k * (g * fu + f * gu);
    final double fl = 1 + zz * polyeval(zz, AIRYAPFN) / p1eval(zz, AIRYAPFD);
    final double gl = z * polyeval(zz, AIRYAPGN) / p1eval(zz, AIRYAPGD);
    final double kk = INV_SQRT_PI * t;
    result[1] = -kk * (g * fl + f * gl);
    result[3] = kk * (f * fl - g * gl);
    return result;
  }

  private static double[] fugu1(final double x) {
    double t = 1;
    double k = 1;
    double f = 1;
    double fu = 1;
    double g = x;
    double gu = x;
    final double cx = x * x * x;
    while (t > MACHINE_PRECISION) {
      fu *= cx;
      fu /= ++k;
      gu *= cx;
      gu /= ++k;
      fu /= k++;
      f += fu;
      gu /= k;
      g += gu;
      t = abs(fu / f);
    }
    return new double[] {AIRYC1 * f, AIRYC2 * g};
  }

  private static double[] fugu2(final double x) {
    double t = 1;
    double k = 4;
    double f = 0.5 * x * x;
    double fu = f / 3;
    final double cx = x * x * x;
    double gu = cx / 3;
    double g = 1 + gu;
    while (t > MACHINE_PRECISION) {
      fu *= cx;
      gu /= k++;
      gu *= cx;
      fu /= k++;
      f += fu;
      gu /= k;
      fu /= k++;
      g += gu;
      t = Math.abs(gu / g);
    }
    return new double[] {AIRYC1 * f, AIRYC2 * g};
  }

  /**
   * Solution of the differential equation <code>y"(x) = xy</code>.
   *
   * The function returns the two independent solutions <code>Ai</code>,
   * <code>Bi</code> and their first derivatives <code>Ai'(x)</code>,
   * <code>Bi'(x)</code>.
   *
   * @param x parameter
   * @return the values <code>Ai, Ai', Bi, Bi'</code>.
   */
  public static double[] airy(final double x) {
    if (x < -2.09) {
      return negativeAiry(x);
    }
    if (x > 103.892) {
      return new double[] {0, 0, POSITIVE_INFINITY, POSITIVE_INFINITY};
    }
    final double t;
    final double g;
    final double k;
    final double ai, bi, aip, bip;
    double f;
    final boolean domflag = x >= 2.09;
    if (domflag) {
      final double sx = sqrt(x);
      final double zeta = 2 * x * sx / 3;
      g = exp(zeta);
      t = sqrt(sx);
      final double z = 1 / zeta;
      f = polyeval(z, AIRYAN) / polyeval(z, AIRYAD);
      ai = INV_SQRT_PI * f / (2 * t * g);
      k = -0.5 * INV_SQRT_PI * t / g;
      f = polyeval(z, AIRYAPN) / polyeval(z, AIRYAPD);
      aip = f * k;
      if (x > 8.3203353) {
        // zeta > 16
        final double j = INV_SQRT_PI * g;
        return new double[] {ai, aip, j * (1 + z * polyeval(z, AIRYBN) / p1eval(z, AIRYBD)) / t, j * t * (1 + z * polyeval(z, AIRYBPPN) / p1eval(z, AIRYBPPD))};
      }
      final double[] fugu1 = fugu1(x);
      bi = SQRT3 * (fugu1[0] + fugu1[1]);
      final double[] fugu2 = fugu2(x);
      bip = SQRT3 * (fugu2[0] + fugu2[1]);
    } else {
      final double[] fugu1 = fugu1(x);
      bi = SQRT3 * (fugu1[0] + fugu1[1]);
      ai = fugu1[0] - fugu1[1];
      final double[] fugu2 = fugu2(x);
      bip = SQRT3 * (fugu2[0] + fugu2[1]);
      aip = fugu2[0] - fugu2[1];
    }
    return new double[] {ai, aip, bi, bip};
  }


}
