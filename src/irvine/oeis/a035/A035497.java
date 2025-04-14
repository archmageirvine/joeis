package irvine.oeis.a035;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035497 Happy primes: primes that eventually reach 1 under iteration of "x -&gt; sum of squares of digits of x".
 * @author Sean A. Irvine
 */
public class A035497 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.FIVE;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Predicates.HAPPY.is(mP)) {
        return mP;
      }
    }
  }
}

