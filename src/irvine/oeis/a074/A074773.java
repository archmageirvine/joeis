package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074773 Strong pseudoprimes to bases 2, 3, 5 and 7.
 * @author Sean A. Irvine
 */
public class A074773 extends Sequence1 {

  private Z mN = Z.valueOf(3215031749L);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN)
        && Predicates.STRONG_PSEUDOPRIME.is(2L, mN)
        && Predicates.STRONG_PSEUDOPRIME.is(3L, mN)
        && Predicates.STRONG_PSEUDOPRIME.is(5L, mN)
        && Predicates.STRONG_PSEUDOPRIME.is(7L, mN)) {
        return mN;
      }
    }
  }
}
