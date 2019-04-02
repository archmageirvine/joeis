package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A000747 Boustrophedon transform of primes.
 * @author Sean A. Irvine
 */
public class A000747 extends A000674 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  // Boustrophedon transform of primes
  @Override
  protected Z a(final int n) {
    mP = mPrime.nextPrime(mP);
    return mP;
  }
}
