package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006489 Numbers k such that k-6, k, and k+6 are primes.
 * @author Sean A. Irvine
 */
public class A006489 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z n = mP.add(6);
      if (n.isProbablePrime() && mP.add(12).isProbablePrime()) {
        return n;
      }
    }
  }
}

