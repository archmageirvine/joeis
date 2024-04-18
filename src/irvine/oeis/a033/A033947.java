package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033947 Smallest primitive root (in absolute value) of n-th prime.
 * @author Sean A. Irvine
 */
public class A033947 extends Sequence1 {

  private final Fast mPrime = new Fast();
  protected Z mP = Z.ONE;

  private static boolean isPrimitiveRoot(final Z[] primes, final Z phi, final Z n, final Z r) {
    for (final Z pi : primes) {
      if (Z.ONE.equals(r.modPow(phi.divide(pi), n))) {
        return false;
      }
    }
    return true;
  }

  /**
   * Find the smallest primitive root of <code>n</code>.
   * @param n modulus
   * @return smallest primitive root of <code>n</code>
   */
  private static Z smallestPrimitiveRoot(final Z n) {
    // Differs from ZUtils.leastPrimitiveRoot in allowing negative results
    if (Z.TWO.equals(n)) {
      return Z.ONE;
    }
    final Z phi = Functions.PHI.z(n);
    final Z[] primes = Jaguar.factor(phi).toZArray();
    Z r = Z.ONE;
    if (isPrimitiveRoot(primes, phi, n, n.subtract(1))) {
      return Z.NEG_ONE;
    }
    while (true) {
      r = r.add(1);
      if (isPrimitiveRoot(primes, phi, n, r)) {
        return r;
      }
      if (isPrimitiveRoot(primes, phi, n, n.subtract(r))) {
        return r.negate();
      }
    }
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    return smallestPrimitiveRoot(mP);
  }
}
