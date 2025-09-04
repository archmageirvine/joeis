package irvine.oeis.a080;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A080103 Greatest prime power in all composite numbers between n-th prime and next prime, a(n) = 1 if no such prime power exists.
 * @author Sean A. Irvine
 */
public class A080103 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    for (long r = mPrime.nextPrime(mP) - 1; r > mP; --r) {
      if (Predicates.PRIME_POWER.is(r)) {
        return Z.valueOf(r);
      }
    }
    return Z.ONE;
  }
}
