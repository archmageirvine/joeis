package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007519 Primes of form <code>8n+1</code>, that is, primes congruent to <code>1 mod 8</code>.
 * @author Sean A. Irvine
 */
public class A007519 implements Sequence {

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
