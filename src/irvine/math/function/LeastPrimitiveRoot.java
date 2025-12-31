package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Least primitive root function.
 * @author Sean A. Irvine
 */
class LeastPrimitiveRoot extends AbstractFunction1 {

  private static boolean isPrimitiveRoot(final Z[] primes, final Z phi, final Z n, final Z r) {
    for (final Z pi : primes) {
      if (r.modPow(phi.divide(pi), n).isOne()) {
        return false;
      }
    }
    return true;
  }

  private static boolean hasPrimitiveRoot(final Z n) {
    if (n.compareTo(Z.TWO) < 0) {
      return false;
    }
    if (n.equals(Z.FOUR) || n.isProbablePrime()) {
      return true;
    }
    final FactorSequence fs = Jaguar.factor(n);
    if (n.isOdd() && fs.omega() == 1) {
      return true;
    }
    if (fs.omega() == 2 && Z.TWO.equals(fs.toZArray()[0]) && fs.getExponent(Z.TWO) == 1) {
      return true;
    }
    return false;
  }

  @Override
  public Z z(final Z n) {
    if (Z.TWO.equals(n)) {
      return Z.ONE;
    }
    if (!hasPrimitiveRoot(n)) {
      return Z.ZERO; // or throw
    }
    final Z phi = Functions.PHI.z(n);
    final Z[] primes = Jaguar.factor(phi).toZArray();
    Z r = Z.ONE;
    while (true) {
      r = r.add(1);
      if (!r.gcd(n).isOne()) {
        continue;
      }
      if (isPrimitiveRoot(primes, phi, n, r)) {
        return r;
      }
    }
  }
}
