package irvine.math.cr;

import irvine.math.z.Z;

/**
 * Compute Euler gamma constant.
 * @author Sean A. Irvine
 */
final class EulerGamma extends SlowCR {

  private static final int SAFETY_BITS = 5;

  EulerGamma() { }

  // See X. Gourdon & P. Sebah, "The Euler Constant: &gamma;"
  // There is a refinement of this algorithm which I have not implemented
  // This implementation is confirmed correct to at least 20000 digits

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

