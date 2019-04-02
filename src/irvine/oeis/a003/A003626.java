package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003626 Inert rational primes in Q(sqrt(-5)).
 * @author Sean A. Irvine
 */
public class A003626 implements Sequence {

  private Z mP = Z.TEN;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(20);
      if (r == 11 || r == 13 || r == 17 || r == 19) {
        return mP;
      }
    }
  }
}
