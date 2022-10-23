package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000355 Primes = 3, 9, 11 (mod 20) such that 2p+1 is also prime.
 * @author Sean A. Irvine
 */
public class A000355 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final long r = mP.mod(20);
      if ((r == 3 || r == 9 || r == 11) && mPrime.isPrime(mP.multiply2().add(1))) {
        return mP;
      }
    }
  }
}
