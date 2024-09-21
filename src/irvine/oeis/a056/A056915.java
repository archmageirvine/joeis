package irvine.oeis.a056;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A056915 Strong pseudoprimes to bases 2, 3 and 5, i.e., intersection of A001262, A020229, and A020231.
 * @author Sean A. Irvine
 */
public class A056915 extends Sequence1 {

  private Z mN = Z.valueOf(25325999);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && Predicates.STRONG_PSEUDOPRIME.is(2L, mN) && Predicates.STRONG_PSEUDOPRIME.is(3L, mN) && Predicates.STRONG_PSEUDOPRIME.is(5L, mN)) {
        return mN;
      }
    }
  }
}
