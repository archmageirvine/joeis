package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020273 Strong pseudoprimes to base 47.
 * @author Sean A. Irvine
 */
public class A020273 extends Sequence1 {

  private Z mN = Z.valueOf(63);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && Predicates.STRONG_PSEUDOPRIME.is(47L, mN)) {
        return mN;
      }
    }
  }
}
