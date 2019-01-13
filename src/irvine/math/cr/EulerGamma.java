package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Compute Euler gamma constant.
 * @author Sean A. Irvine
 */
public final class EulerGamma extends SlowCR {

  /** The Euler gamma constant. */
  public static final CR SINGLETON = new EulerGamma();
  
  private static final int SAFETY_BITS = 5;

  private EulerGamma() { }

  // See X. Gourdon & P. Sebah, "The Euler Constant: &gamma;"
  // There is a refinement of this algorithm which I have not implemented
  // This implementation is confirmed correct to at least 20000 digits

  /*
  // Earlier implementation using Apfloat library
  private static Apfloat gamma(final int bits) {
    // Use slightly more precision
    final long d = bits + 5;
    final long n = (long) (1 + 0.25 * Math.log(2) * bits);

    Apfloat a = new Apfloat(0, d, 2);
    Apfloat b = new Apfloat(1, d, 2);
    Apfloat u = a;
    Apfloat v = b;
    final Apfloat nn = new Apfloat(n * n, d, 2);
    for (long k = 1; k < 4 * n; ++k) {
      final Apfloat kf = new Apfloat(k, d, 2);
      final Apfloat kf2 = new Apfloat(k * k, d, 2);
      b = b.multiply(nn).divide(kf2);
      a = a.multiply(nn).divide(kf).add(b).divide(kf);
      u = u.add(a);
      v = v.add(b);
    }
    final Apfloat log = ApfloatMath.log(new Apfloat(n, d, 2));
    return u.divide(v).subtract(log);
  }
  */

  /**
   * Compute the gamma constant to the specified number of bits.
   * Scales up and computes in space of integers.
   * @param bits number of bits
   * @return gamma
   */
  private static Z gamma(final int bits) {
    // Use slightly more precision
    final int d = bits + SAFETY_BITS;
    final long n = (long) (1 + 0.25 * Math.log(2) * bits);

    Z a = Z.ZERO;
    Z b = Z.ONE.shiftLeft(d);
    Z u = a;
    Z v = b;
    final Z nn = Z.valueOf(n).square();
    for (long k = 1; k < 4 * n; ++k) {
      final Z kf = Z.valueOf(k);
      final Z kf2 = kf.square();
      b = b.multiply(nn).divide(kf2);
      a = a.multiply(nn).divide(kf).add(b).divide(kf);
      u = u.add(a);
      v = v.add(b);
    }
    final CR logN = CR.valueOf(n).log();
    final Z scaled = u.shiftLeft(d).divide(v);
    return scaled.subtract(logN.getApprox(-d)).shiftRight(SAFETY_BITS);
  }

  @Override
  protected Z approximate(final int p) {
    if (p >= 1) {
      return Z.ZERO;
    }
    return gamma(-p);
  }
}

