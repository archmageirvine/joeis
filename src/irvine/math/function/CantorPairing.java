package irvine.math.function;

import irvine.math.z.Z;

/**
 * Cantor&apos;s pairing function (0-based).
 * @author Georg Fischer
 */
class CantorPairing extends AbstractFunction2 {

  @Override
  public Z z(final long n, final long m) {
    if (n < 0 || m < 0) {
      throw new IllegalArgumentException();
    }
    return Z.valueOf(n + m).multiply(n + m + 1).divide2().add(n);
  }
}
