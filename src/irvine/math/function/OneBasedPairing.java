package irvine.math.function;

import irvine.math.z.Z;

/**
 * Pairing function of Hopcroft and Ullman (1-based).
 * @author Georg Fischer
 */
class OneBasedPairing extends AbstractFunction2 {

  @Override
  public Z z(final long n, final long m) {
    if (n < 1 || m < 1) {
      throw new IllegalArgumentException();
    }
    return Z.valueOf(n + m - 2).multiply(n + m - 1).divide2().add(n);
  }
}
