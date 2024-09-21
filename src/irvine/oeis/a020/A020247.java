package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A020247 Strong pseudoprimes to base 21.
 * @author Sean A. Irvine
 */
public class A020247 extends Sequence1 {

  private Z mN = Z.valueOf(219);
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(2);
      if (!mPrime.isPrime(mN) && Predicates.STRONG_PSEUDOPRIME.is(21L, mN)) {
        return mN;
      }
    }
  }
}
