package irvine.math.r;

import static irvine.math.r.Airy.airy;
import static irvine.math.r.Constants.MAXLOG;
import static irvine.math.r.Constants.QUARTER_PI;
import static irvine.math.r.Constants.SQRT2_DIV_PI;
import static irvine.math.r.Gamma.MAXGAMMA;
import static irvine.math.r.PolyEval.p1eval;
import static irvine.math.r.PolyEval.polyeval;
import static irvine.math.r.Power.cbrt;

/**
 * Private implementations of some Bessel functions.
 *
 * @author Sean A. Irvine
 */
final class BesselJ {

  private BesselJ() { }

  private static final double BIG = 1.44115188075855872E+17;

  /**
   * Recurrence calculation.
   *
   * @param n parameter
   * @param x parameter
   * @param cancel cancellation flag
   * @return {result, n, new-n}
   */
  private static double[] recur(double n, final double x, final double kf, final boolean cancel) {

    int nflag = n < 0 ? 1 : 0;
    double ans;

    while (true) {
      double pkm2 = 0;
      double qkm2 = 1;
      double pkm1 = x;
      double qkm1 = n + n;
      final double xk = -x * x;
      double yk = qkm1;
      ans = 1;
      double t;
      int ctr = 0;

      do {
        yk += 2;
        final double pk = pkm1 * yk + pkm2 * xk;
        final double qk = qkm1 * yk + qkm2 * xk;
        pkm2 = pkm1;
        pkm1 = pk;
        qkm2 = qkm1;
        qkm1 = qk;
        final double r = qk != 0 ? pk / qk : 0;
        if (r != 0) {
          t = Math.abs((ans - r) / r);
          ans = r;
        } else {
          t = 1;
        }
        if (++ctr > 1000) {
          break; // underflow
        }
        if (t < Constants.MACHINE_PRECISION) {
          break;
        }
        if (Math.abs(pk) > BIG) {
          pkm2 /= BIG;
          pkm1 /= BIG;
          qkm2 /= BIG;
          qkm1 /= BIG;
        }
      } while (t > Constants.MACHINE_PRECISION);

      if (nflag > 0 && Math.abs(ans) < 0.125) {
        nflag = -1;
        --n;
      } else {
        break;
      }
    }

    // backward recurrence
    double pk = 1;
    double pkm2, pkm1 = 1 / ans;
    double k = n - 1;
    double r = 2 * k;

    do {
      pkm2 = (pkm1 * r - pk * x) / x;
      pk = pkm1;
      pkm1 = pkm2;
      r -= 2;
    } while (--k > kf + 0.5);

    // take larger of last two iterations
    if (cancel && kf >= 0 && Math.abs(pk) > Math.abs(pkm1)) {
        ++k;
        pkm2 = pk;
    }

    return new double[] {pkm2, n, k};
  }

  private static double jvs(final double n, final double x) {

    final double z = -x * x / 4;
    double u = 1;
    double y = u;
    double k = 1;
    double t = 1;

    while (t > Constants.MACHINE_PRECISION) {
      u *= z / (k * (n + k));
      y += u;
      ++k;
      if (y != 0) {
        t = Math.abs(u / y);
      }
    }

    final int ex = (int) n * Power.getExponent(0.5 * x);
    if (ex > -1023 && ex < 1023 && n > 0 && n < MAXGAMMA - 1) {
      t = Math.pow(0.5 * x, n) / Gamma.gamma(n + 1);
      y *= t;
    } else {
      t = n * Math.log(0.5 * x) - Gamma.lgamma(n + 1);
      if (y < 0) {
        Gamma.sLGammaSign = -Gamma.sLGammaSign;
        y = -y;
      }
      t += Math.log(y);
      if (t < -MAXLOG) {
        return 0;
      }
      if (t > MAXLOG) {
        return Double.POSITIVE_INFINITY;
      }
      y = Gamma.sLGammaSign * Math.exp(t);
    }
    return y;
  }

  private static double hankel(final double n, final double x) {

    final double m = 4 * n * n;
    double j = 1;
    final double z = 8 * x;
    double k = 1;
    double p = 1;
    double u = (m - 1) / z;
    double q = u;
    double sign = 1;
    double conv = 1;
    double t = 1;
    double pp = 1E38;
    double qq = 1E38;
    boolean flag = false;

    while (t > Constants.MACHINE_PRECISION) {
      k += 2;
      sign = -sign;
      u *= (m - k * k) / (++j * z);
      p += sign * u;
      k += 2;
      u *= (m - k * k) / (++j * z);
      q += sign * u;
      t = Math.abs(u / p);
      if (t < conv) {
        conv = t;
        qq = q;
        pp = p;
        flag = true;
      }
      // stop if terms start getting larger
      if (flag && t > conv) {
        break;
      }
    }

    u = x - (0.5 * n + 0.25) * Math.PI;
    return Math.sqrt(2 / (Math.PI * x)) * (pp * Math.cos(u) - qq * Math.sin(u));
  }

  private static final double[] JNXLAMBDA = {
    1,
    1.041666666666666666666667E-1,
    8.355034722222222222222222E-2,
    1.282265745563271604938272E-1,
    2.918490264641404642489712E-1,
    8.816272674437576524187671E-1,
    3.321408281862767544702647E+0,
    1.499576298686255465867237E+1,
    7.892301301158651813848139E+1,
    4.744515388682643231611949E+2,
    3.207490090890661934704328E+3
  };

  private static final double[] JNXMU = {
     1,
    -1.458333333333333333333333E-1,
    -9.874131944444444444444444E-2,
    -1.433120539158950617283951E-1,
    -3.172272026784135480967078E-1,
    -9.424291479571202491373028E-1,
    -3.511203040826354261542798E+0,
    -1.572726362036804512982712E+1,
    -8.228143909718594444224656E+1,
    -4.923553705236705240352022E+2,
    -3.316218568547972508762102E+3
  };

  private static final double[] JNXP1 = {
    -2.083333333333333333333333E-1,
     1.250000000000000000000000E-1
  };

  private static final double[] JNXP2 = {
    3.342013888888888888888889E-1,
   -4.010416666666666666666667E-1,
    7.031250000000000000000000E-2
  };

  private static final double[] JNXP3 = {
   -1.025812596450617283950617E+0,
    1.846462673611111111111111E+0,
   -8.912109375000000000000000E-1,
    7.324218750000000000000000E-2
  };

  private static final double[] JNXP4 = {
    4.669584423426247427983539E+0,
   -1.120700261622299382716049E+1,
    8.789123535156250000000000E+0,
   -2.364086914062500000000000E+0,
    1.121520996093750000000000E-1
  };

  private static final double[] JNXP5 = {
   -2.8212072558200244877E1,
    8.4636217674600734632E1,
   -9.1818241543240017361E1,
    4.2534998745388454861E1,
   -7.3687943594796316964E0,
    2.27108001708984375E-1
  };

  private static final double[] JNXP6 = {
    2.1257013003921712286E2,
   -7.6525246814118164230E2,
    1.0599904525279998779E3,
   -6.9957962737613254123E2,
    2.1819051174421159048E2,
   -2.6491430486951555525E1,
    5.7250142097473144531E-1
  };

  private static final double[] JNXP7 = {
   -1.9194576623184069963E3,
    8.0617221817373093845E3,
   -1.3586550006434137439E4,
    1.1655393336864533248E4,
   -5.3056469786134031084E3,
    1.2009029132163524628E3,
   -1.0809091978839465550E2,
    1.7277275025844573975E0
  };

  private static final double[] JNTPF2 = {
    -9.0000000000000000000E-2,
     8.5714285714285714286E-2
  };

  private static final double[] JNTPF3 = {
     1.3671428571428571429E-1,
    -5.4920634920634920635E-2,
    -4.4444444444444444444E-3
  };

  private static final double[] JNTPF4 = {
    1.3500000000000000000E-3,
   -1.6036054421768707483E-1,
    4.2590187590187590188E-2,
    2.7330447330447330447E-3
  };

  private static final double[] JNTPG1 = {
   -2.4285714285714285714E-1,
    1.4285714285714285714E-2
  };

  private static final double[] JNTPG2 = {
    -9.0000000000000000000E-3,
     1.9396825396825396825E-1,
    -1.1746031746031746032E-2
  };

  private static final double[] JNTPG3 = {
    1.9607142857142857143E-2,
   -1.5983694083694083694E-1,
    6.3838383838383838384E-3
  };

  private static double jnx(final double n, final double x) {
    // test for x very close to x
    final double cbn = cbrt(n);
    double z = (x - n) / cbn;
    if (Math.abs(z) <= 0.7) {
      final double cbtwo = cbrt(2);
      double zz = -cbtwo * z;
      final double[] air = airy(zz);
      zz = z * z;
      final double z3 = zz * z;
      final double[] f = {
        1, -z / 5,
        polyeval(z3, JNTPF2) * zz,
        polyeval(z3, JNTPF3),
        polyeval(z3, JNTPF4) * z
      };
      final double[] g = {
        0.3 * zz,
        polyeval(z3, JNTPG1),
        polyeval(z3, JNTPG2) * z,
        polyeval(z3, JNTPG3) * zz
      };
      double pp = 0;
      double qq = 0;
      double nk = 1;
      final double n23 = cbrt(n * n);

      for (int k = 0; k <= 4; ++k) {
        pp += f[k] * nk;
        if (k != 4) {
          qq += g[k] * nk;
        }
        nk /= n23;
      }
      return cbtwo * air[0] * pp / cbn + cbrt(4) * air[1] * qq / n;
    }

    z = x / n;
    final double zz = 1 - z * z;
    if (zz == 0) {
      return 0;
    }
    final double sz;
    double t;
    final double zeta;
    final int nflg;
    if (zz > 0) {
      sz = Math.sqrt(zz);
      t = 1.5 * (Math.log((1 + sz) / z) - sz); // zeta^{3/2}
      zeta = cbrt(t * t);
      nflg = 1;
    } else {
      sz = Math.sqrt(-zz);
      t = 1.5 * (sz - Math.acos(1 / z));
      zeta = -cbrt(t * t);
      nflg = -1;
    }
    final double z32i = Math.abs(1 / t);
    final double sqz = cbrt(t);

    // Airy function
    final double n23 = cbrt(n * n);
    t = n23 * zeta;
    final double[] air = airy(t);
    final double[] u = new double[8];
    u[0] = 1;
    final double zzi = 1 / zz;
    u[1] = polyeval(zzi, JNXP1) / sz;
    u[2] = polyeval(zzi, JNXP2) / zz;
    u[3] = polyeval(zzi, JNXP3) / (sz * zz);
    double pp = zz * zz;
    u[4] = polyeval(zzi, JNXP4) / pp;
    u[5] = polyeval(zzi, JNXP5) / (pp * sz);
    pp *= zz;
    u[6] = polyeval(zzi, JNXP6) / pp;
    u[7] = polyeval(zzi, JNXP7) / (pp * sz);
    
    pp = 0;
    double qq = 0;
    double np = 1;
    boolean doa = true;
    boolean dob = true;
    double ak1 = Double.MAX_VALUE;
    double bk1 = Double.MAX_VALUE;

    for (int k = 0; k <= 3; ++k) {
      final int tk = 2 * k;
      final int tkp1 = tk + 1;
      double zp = 1;
      double ak = 0;
      double bk = 0;
      int m, sign;
      for (int s = 0; s <= tk; ++s) {
        if (doa) {
          if ((s & 3) > 1) {
            sign = nflg;
          } else {
            sign = 1;
          }
          ak += sign * JNXMU[s] * zp * u[tk - s];
        }
        if (dob) {
          m = tkp1 - s;
          if (((m + 1) & 3) > 1) {
            sign = nflg;
          } else {
            sign = 1;
          }
          bk += sign * JNXLAMBDA[s] * zp * u[m];
        }
        zp *= z32i;
      }

      if (doa) {
        ak *= np;
        t = Math.abs(ak);
        if (t < ak1) {
          ak1 = t;
          pp += ak;
        } else {
          doa = false;
        }
      }
      if (dob) {
        bk += JNXLAMBDA[tkp1] * zp * u[0];
        bk *= -np / sqz;
        t = Math.abs(bk);
        if (t < bk1) {
          bk1 = t;
          qq += bk;
        } else {
          dob = false;
        }
      }

      if (np < Constants.MACHINE_PRECISION) {
        break;
      }
      np /= n * n;
    }

    // normalizing factor (4*zeta/(1-z^2))^(1/4)
    t = Math.sqrt(Math.sqrt(4 * zeta / zz));
    t *= air[0] * pp / cbrt(n) + air[1] * qq / (n23 * n);

    return t;
  }

  static final double[] J0PP = {
    7.96936729297347051624E-4,
    8.28352392107440799803E-2,
    1.23953371646414299388E0,
    5.44725003058768775090E0,
    8.74716500199817011941E0,
    5.30324038235394892183E0,
    9.99999999999999997821E-1,
  };

  static final double[] J0PQ = {
    9.24408810558863637013E-4,
    8.56288474354474431428E-2,
    1.25352743901058953537E0,
    5.47097740330417105182E0,
    8.76190883237069594232E0,
    5.30605288235394617618E0,
    1.00000000000000000218E0,
  };

  static final double[] J0QP = {
    -1.13663838898469149931E-2,
    -1.28252718670509318512E0,
    -1.95539544257735972385E1,
    -9.32060152123768231369E1,
    -1.77681167980488050595E2,
    -1.47077505154951170175E2,
    -5.14105326766599330220E1,
    -6.05014350600728481186E0,
  };

  static final double[] J0QQ = {
    6.43178256118178023184E1,
    8.56430025976980587198E2,
    3.88240183605401609683E3,
    7.24046774195652478189E3,
    5.93072701187316984827E3,
    2.06209331660327847417E3,
    2.42005740240291393179E2,
  };

  private static final double[] J0RP = {
   -4.79443220978201773821E9,
    1.95617491946556577543E12,
   -2.49248344360967716204E14,
    9.70862251047306323952E15,
  };

  private static final double[] J0RQ = {
    4.99563147152651017219E2,
    1.73785401676374683123E5,
    4.84409658339962045305E7,
    1.11855537045356834862E10,
    2.11277520115489217587E12,
    3.10518229857422583814E14,
    3.18121955943204943306E16,
    1.71086294081043136091E18,
  };

  /**
   * Compute the Bessel function J_0(x) of order zero.
   *
   * @param x parameter
   * @return J_0(x)
   */
  static double j0(double x) {
    if (x < 0) {
      x = -x;
    }
    final double z = x * x;
    if (x <= 5) {
      if (x < 1E-5) {
        return 1 - z * 0.25;
      }
      return (z - 5.783185962946784521175995758455807035071) * (z - 30.47126234366208639907816317502275584842) * polyeval(z, J0RP) / p1eval(z, J0RQ);
    }
    final double w = 5 / x;
    double q = 25 / z;
    final double p = polyeval(q, J0PP) / polyeval(q, J0PQ);
    q = polyeval(q, J0QP) / p1eval(q, J0QQ);
    final double xn = x - QUARTER_PI;
    return (p * Math.cos(xn) - w * q * Math.sin(xn)) * SQRT2_DIV_PI / Math.sqrt(x);
  }

  /**
   * Compute the Bessel function of order n of the argument x for real-valued
   * n.
   *
   * @param n parameter
   * @param x parameter
   * @return J_n(x)
   */
  public static double j(double n, double x) {
    final double an = Math.abs(n);
    double y = Math.floor(an);
    double q;
    int sign = 1; // flag for sign inversion
    int nint = 0; // flag for integer n

    if (y == an) {
      // integer order specified
      nint = 1;
      final int i = (int) (an - 16384 * Math.floor(an / 16384));
      if (n < 0) {
        if ((i & 1) == 1) {
          sign = -sign;
        }
        n = an;
      }
      if (x < 0) {
        if ((i & 1) == 1) {
          sign = -sign;
        }
        x = -x;
      }
      if (n == 0) {
        return j0(x);
      }
      if (n == 1) {
        return (double) sign * Bessel.j1(x);
      }
    }

    if (x < 0 && y != an) {
      return Double.NaN; // domain error
    }
    y = Math.abs(x);
    if (y < Constants.MACHINE_PRECISION) {
      return 0;
    }
    double k = 3.6 * Math.sqrt(y);
    double t = 3.6 * Math.sqrt(an);

    if (y < t && an > 21) {
      return (double) sign * jvs(n, x);
    }
    if (an < k && y > 21) {
      return (double) sign * hankel(n, x);
    }
    if (an < 500) {
      // if x is too large, the continued fraction will fail, but then the
      // Hankel expansion can be used
      if (nint != 0) {
        k = 0;
        final double[] qq = recur(n, x, k, true);
        q = qq[0];
        n = qq[1];
        k = qq[2];
        if (k == 0) {
          return (double) sign * (j0(x) / q);
        }
        if (k == 1) {
          return (double) sign * (Bessel.j1(x) / q);
        }
      }

      if ((an > 2 * y) || (n >= 0 && n < 20 && y > 6 && y < 20)) {
        // recur backwards for a larger value of n
        k = n;
        y += an + 1;
        if (y < 30) {
          y = 30;
        }
        y = n + Math.floor(y - n);
        final double[] qq = recur(y, x, k, false);
        return (double) sign * (jvs(qq[1], x) * qq[0]);
      }

      if (k <= 30) {
        k = 2;
      } else if (k < 90) {
        k = (3 * k) / 4;
      }
      if (an > k + 3) {
        if (n < 0) {
          k = -k;
        }
        q = n - Math.floor(n);
        k = Math.floor(k) + q;
        if (n > 0) {
          final double[] qq = recur(n, x, k, true);
          q = qq[0];
          n = qq[1];
          k = qq[2];
        } else {
          t = k;
          k = n;
          final double[] qq = recur(t, x, k, true);
          q = qq[0];
          t = qq[1];
          //          k = qq[2];
          k = t;
        }
        if (q == 0) {
          return 0;
        }
      } else {
        k = n;
        q = 1;
      }

      // boundary between convergence of power series and Hankel expansion
      y = Math.abs(k);
      if (y < 26) {
        t = (0.0083 * y + 0.09) * y + 12.9;
      } else {
        t = 0.9 * y;
      }
      if (x > t) {
        y = hankel(k, x);
      } else {
        y = jvs(k, x);
      }
      if (n > 0) {
        y /= q;
      } else {
        y *= q;
      }
    } else {
      // for large n, use the uniform expansion or the transitional expansion
      if (n < 0) {
        return 0; // loss of significance
      }
      t = x / n;
      t /= n;
      if (t > 0.3) {
        y = hankel(n, x);
      } else {
        y = jnx(n, x);
      }
    }
    return (double) sign * y;
  }

}
