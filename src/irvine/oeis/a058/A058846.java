package irvine.oeis.a058;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058846 Numbers k such that the sum of odd primes up to k is palindromic.
 * @author Sean A. Irvine
 */
public class A058846 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      mN = mN.add(mP);
      if (Predicates.PALINDROME.is(mN)) {
        return Z.valueOf(mP);
      }
    }
  }
}
