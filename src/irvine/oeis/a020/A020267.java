package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020267 Strong pseudoprimes to base 41.
 * @author Sean A. Irvine
 */
public class A020267 extends Sequence1 {

  private Z mN = Z.valueOf(19);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && Predicates.STRONG_PSEUDOPRIME.is(41L, mN)) {
        return mN;
      }
    }
  }
}
