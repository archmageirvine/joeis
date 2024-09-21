package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020292 Strong pseudoprimes to base 66.
 * @author Sean A. Irvine
 */
public class A020292 extends Sequence1 {

  private Z mN = Z.valueOf(63);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && Predicates.STRONG_PSEUDOPRIME.is(66L, mN)) {
        return mN;
      }
    }
  }
}
