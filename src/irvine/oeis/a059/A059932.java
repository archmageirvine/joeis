package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059932 a(n) is formed by concatenating the next prime(n) primes.
 * @author Sean A. Irvine
 */
public class A059932 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mQ = 1;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    mP = mPrime.nextPrime(mP);
    for (long k = 0; k < mP; ++k) {
      mQ = mPrime.nextPrime(mQ);
      sb.append(mQ);
    }
    return new Z(sb);
  }
}
