package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007519 Primes of form 8n+1, that is, primes congruent to 1 mod 8.
 * @author Sean A. Irvine
 */
public class A007519 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 16;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP & 7) == 1) {
        return Z.valueOf(mP);
      }
    }
  }
}
