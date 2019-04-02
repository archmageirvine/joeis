package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003632 Inert rational primes in Q(sqrt 7), or, 7 is not a square mod p.
 * @author Sean A. Irvine
 */
public class A003632 implements Sequence {

  private Z mP = Z.THREE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(28);
      if (r == 5 || r == 11 || r == 13 || r == 15 || r == 17 || r == 23) {
        return mP;
      }
    }
  }
}
