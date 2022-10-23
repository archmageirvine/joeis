package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000353 Primes == 7, 19, 23 (mod 40) such that (p-1)/2 is also prime.
 * @author Sean A. Irvine
 */
public class A000353 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(40);
      if ((r == 7 || r == 19 || r == 23) && mPrime.isPrime(mP.subtract(Z.ONE).divide2())) {
        return mP;
      }
    }
  }
}
