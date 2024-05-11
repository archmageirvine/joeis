package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062325 Numbers k for which phi(prime(k)) is a square.
 * @author Sean A. Irvine
 */
public class A062325 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mP = mPrime.nextPrime(mP);
      if (Predicates.SQUARE.is(mP - 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
