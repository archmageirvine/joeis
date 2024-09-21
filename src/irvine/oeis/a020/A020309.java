package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020309 Strong pseudoprimes to base 83.
 * @author Sean A. Irvine
 */
public class A020309 extends Sequence1 {

  private Z mN = Z.valueOf(19);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && Predicates.STRONG_PSEUDOPRIME.is(83L, mN)) {
        return mN;
      }
    }
  }
}
