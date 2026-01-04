package irvine.oeis.a082;

import java.util.HashSet;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082979 Lexicographically earliest rearrangement of primes such that the sum of two consecutive terms is a palindrome.
 * @author Sean A. Irvine
 */
public class A082979 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final HashSet<Long> mUsed = new HashSet<>();
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (Predicates.PALINDROME.is(mA.add(p)) && mUsed.add(p)) {
        mA = Z.valueOf(p);
        return mA;
      }
    }
  }
}
