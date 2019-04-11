package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007522 Primes of the form <code>8n+7,</code> that is, primes congruent to <code>-1 mod 8</code>.
 * @author Sean A. Irvine
 */
public class A007522 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 6;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((mP & 7) == 7) {
        return Z.valueOf(mP);
      }
    }
  }
}
