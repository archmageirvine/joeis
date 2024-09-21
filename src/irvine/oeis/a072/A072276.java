package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072276 Strong pseudoprimes to bases 2 and 3.
 * @author Sean A. Irvine
 */
public class A072276 extends Sequence1 {

  private Z mN = Z.valueOf(1373651);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && Predicates.STRONG_PSEUDOPRIME.is(2L, mN) && Predicates.STRONG_PSEUDOPRIME.is(3L, mN)) {
        return mN;
      }
    }
  }
}
