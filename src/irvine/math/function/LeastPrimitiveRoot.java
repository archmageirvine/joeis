package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Least primitive root function.
 * @author Sean A. Irvine
 */
class LeastPrimitiveRoot extends AbstractFunction1 {

  private static boolean isPrimitiveRoot(final Z[] primes, final Z phi, final Z n, final Z r) {
    for (final Z pi : primes) {
      if (Z.ONE.equals(r.modPow(phi.divide(pi), n))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z z(final Z n) {
    if (Z.TWO.equals(n)) {
      return Z.ONE;
    }
    final Z phi = Functions.PHI.z(n);
    final Z[] primes = Jaguar.factor(phi).toZArray();
    Z r = Z.ONE;
    while (true) {
      r = r.add(1);
      if (isPrimitiveRoot(primes, phi, n, r)) {
        return r;
      }
    }
  }
}
