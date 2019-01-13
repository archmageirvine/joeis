package irvine.math.r;

import static irvine.math.r.Constants.MAXLOG;
import static irvine.math.r.PolyEval.chebyshev;

/**
 * Bessel K functions implementation.
 *
 * @author Sean A. Irvine
 */
final class BesselK {

  private BesselK() { }

  private static final double[] KA = {
    1.37446543561352307156E-16,
    4.25981614279661018399E-14,
    1.03496952576338420167E-11,
    1.90451637722020886025E-9,
    2.53479107902614945675E-7,
    2.28621210311945178607E-5,
    1.26461541144692592338E-3,
    3.59799365153615016266E-2,
    3.44289899924628486886E-1,
   -5.35327393233902768720E-1
  };

  private static final double[] KB = {
    5.30043377268626276149E-18,
   -1.64758043015242134646E-17,
    5.21039150503902756861E-17,
   -1.67823109680541210385E-16,
    5.51205597852431940784E-16,
   -1.84859337734377901440E-15,
    6.34007647740507060557E-15,
   -2.22751332699166985548E-14,
    8.03289077536357521100E-14,
   -2.98009692317273043925E-13,
    1.14034058820847496303E-12,
   -4.51459788337394416547E-12,
    1.85594911495471785253E-11,
   -7.95748924447710747776E-11,
    3.57739728140030116597E-10,
   -1.69753450938905987466E-9,
    8.57403401741422608519E-9,
   -4.66048989768794782956E-8,
    2.76681363944501510342E-7,
   -1.83175552271911948767E-6,
    1.39498137188764993662E-5,
   -1.28495495816278026384E-4,
    1.56988388573005337491E-3,
   -3.14481013119645005427E-2,
    2.44030308206595545468E0
  };

  /**
   * Compute the modified Bessel function of the third kind of order zero
   * at the specified point.
   *
   * @param x parameter
   * @return K_0(x)
   */
  static double k0(final double x) {
    if (x <= 0) {
      return Double.NaN;
    }
    if (x <= 2) {
      return chebyshev(x * x - 2, KA) - Math.log(0.5 * x) * Bessel.i0(x);
    }
    return Math.exp(-x) * chebyshev(8 / x - 2, KB) / Math.sqrt(x);
  }

  /**
   * Compute the exponentially scaled modified Bessel function of the third kind
   * of order zero at the specified point.
   *
   * @param x parameter
   * @return K_0(x) * exp(x)
   */
  static double k0exp(final double x) {
    if (x <= 0) {
      return Double.NaN;
    }
    if (x <= 2) {
      return (chebyshev(x * x - 2, KA) - Math.log(0.5 * x) * Bessel.i0(x)) * Math.exp(x);
    }
    return chebyshev(8 / x - 2, KB) / Math.sqrt(x);
  }

  private static final double[] K1A = {
    -7.02386347938628759343E-18,
    -2.42744985051936593393E-15,
    -6.66690169419932900609E-13,
    -1.41148839263352776110E-10,
    -2.21338763073472585583E-8,
    -2.43340614156596823496E-6,
    -1.73028895751305206302E-4,
    -6.97572385963986435018E-3,
    -1.22611180822657148235E-1,
    -3.53155960776544875667E-1,
     1.52530022733894777053E0
  };

  private static final double[] K1B = {
   -5.75674448366501715755E-18,
    1.79405087314755922667E-17,
   -5.68946255844285935196E-17,
    1.83809354436663880070E-16,
   -6.05704724837331885336E-16,
    2.03870316562433424052E-15,
   -7.01983709041831346144E-15,
    2.47715442448130437068E-14,
   -8.97670518232499435011E-14,
    3.34841966607842919884E-13,
   -1.28917396095102890680E-12,
    5.13963967348173025100E-12,
   -2.12996783842756842877E-11,
    9.21831518760500529508E-11,
   -4.19035475934189648750E-10,
    2.01504975519703286596E-9,
   -1.03457624656780970260E-8,
    5.74108412545004946722E-8,
   -3.50196060308781257119E-7,
    2.40648494783721712015E-6,
   -1.93619797416608296024E-5,
    1.95215518471351631108E-4,
   -2.85781685962277938680E-3,
    1.03923736576817238437E-1,
    2.72062619048444266945E0
  };


  /**
   * Compute the modified Bessel function of the third kind, order one,
   * at the specified position.
   *
   * @param x parameter
   * @return K_1(x)
   */
  static double k1(final double x) {
    final double z = 0.5 * x;
    if (z <= 0) {
      return Double.NaN;
    }
    if (x <= 2) {
      return Math.log(z) * Bessel.i1(x) + chebyshev(x * x - 2, K1A) / x;
    }
    return Math.exp(-x) * chebyshev(8 / x - 2, K1B) / Math.sqrt(x);
  }

  /**
   * Compute the exponentially scaled modified Bessel function of the
   * third kind, order one, at the specified position.
   *
   * @param x parameter
   * @return K_1(x) * exp(x)
   */
  static double k1exp(final double x) {
    final double z = 0.5 * x;
    if (z <= 0) {
      return Double.NaN;
    }
    if (x <= 2) {
      return (Math.log(z) * Bessel.i1(x) + chebyshev(x * x - 2, K1A) / x) * Math.exp(x);
    }
    return chebyshev(8 / x - 2, K1B) / Math.sqrt(x);
  }


  /**
   * Compute the modified Bessel function of the third kind at the
   * specified integer order.
   *
   * @param n order
   * @param x parameter
   * @return K_n(x)
   */
  static double k(int n, final double x) {
    n = Math.abs(n);
    if (n > 31) {
      return Double.POSITIVE_INFINITY; // overflow
    }
    if (x <= 0) {
      return Double.NaN; // domain error or singularity
    }
    if (x <= 9.55) {
      double ans = 0;
      final double z0 = 0.25 * x * x;
      double fn = 1;
      double pn = 0;
      double zmn = 1;
      final double tox = 2 / x;
      double s, t, k;

      if (n > 0) {
        // compute factorial of n and psi(n)
        pn = -Constants.EULER;
        k = 1;
        for (int i = 1; i < n; ++i) {
          pn += 1 / k;
          fn *= ++k;
        }
        zmn = tox;
        if (n == 1) {
          ans = 1 / x;
        } else {
          double nk1f = fn / n;
          double kf = 1;
          s = nk1f;
          final double z = -z0;
          double zn = 1;
          for (int i = 1; i < n; ++i) {
            nk1f /= (double) (n - i);
            kf *= (double) i;
            zn *= z;
            t = nk1f * zn / kf;
            s += t;
            if ((Double.MAX_VALUE - Math.abs(t)) < Math.abs(s)) {
              return Double.POSITIVE_INFINITY; // overflow
            }
            if (tox > 1 && Double.MAX_VALUE / tox < zmn) {
              return Double.POSITIVE_INFINITY; // overflow
            }
            zmn *= tox;
          }
          s *= 0.5;
          t = Math.abs(s);
          if (zmn > 1 && Double.MAX_VALUE / zmn < t) {
            return Double.POSITIVE_INFINITY; // overflow
          }
          if (t > 1 && Double.MAX_VALUE / t < zmn) {
            return Double.POSITIVE_INFINITY; // overflow
          }
          ans = s * zmn;
        }
      }
      final double t1g = 2 * Math.log(0.5 * x);
      double pk = -Constants.EULER;
      if (n == 0) {
        pn = pk;
        t = 1;
      } else {
        pn += 1.0 / n;
        t = 1 / fn;
      }
      s = (pk + pn - t1g) * t;
      k = 1;
      do {
        t *= z0 / (k * (k + n));
        pk += 1 / k;
        pn += 1 / (k + n);
        s += (pk + pn - t1g) * t;
        ++k;
      } while (Math.abs(t / s) > Constants.MACHINE_PRECISION);
      s = 0.5 * s / zmn;
      if ((n & 1) != 0) {
        s = -s;
      }
      return ans + s;
    } else {
      // asymptotic expansion
      if (x > MAXLOG) {
        return 0; // underflow
      }
      final double k = (double) n;
      final double pn = 4 * k * k;
      double pk = 1;
      final double z0 = 8 * x;
      double fn = 1;
      double t = 1;
      double s = t;
      double nkf = Double.MAX_VALUE;
      int i = 0;
      do {
        final double z = pn - pk * pk;
        t = t * z / (fn * z0);
        final double nk1f = Math.abs(t);
        if (i >= n && nk1f > nkf) {
          return Math.exp(-x) * Math.sqrt(Math.PI / (2 * x)) * s;
        }
        ++i;
        nkf = nk1f;
        s += t;
        ++fn;
        pk += 2;
      } while (Math.abs(t / s) > Constants.MACHINE_PRECISION);
      return Math.exp(-x) * Math.sqrt(Math.PI / (2 * x)) * s;
    }
  }

}

