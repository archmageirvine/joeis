package irvine.oeis.a226;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A226079 Primes p such that p plus its decimal reversal is a cube.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A226079 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 203993940;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (Predicates.CUBE.is(Functions.REVERSE.z(mP).add(mP))) {
        return Z.valueOf(mP);
      }
    }
  }
}
