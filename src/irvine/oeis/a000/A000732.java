package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;

/**
 * A000732 Boustrophedon transform of primes <code>1,2,3,5,7,..</code>.
 * @author Sean A. Irvine
 */
public class A000732 extends A000674 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  // Boustrophedon transform of primes
  @Override
  protected Z a(final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    mP = mPrime.nextPrime(mP);
    return mP;
  }
}
