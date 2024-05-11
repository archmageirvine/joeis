package irvine.oeis.a016;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A016041 Primes that are palindromic in base 2 (but written here in base 10).
 * @author Sean A. Irvine
 */
public class A016041 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Predicates.PALINDROME.is(2, mP)) {
        return mP;
      }
    }
  }
}
