package irvine.oeis.a065;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065988 a(n) is the largest prime p &lt; n such that n mod p is a perfect square; a(n) = 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A065988 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    long p = mPrime.prevPrime(++mN);
    while (p >= 2) {
      if (Predicates.SQUARE.is(mN % p)) {
        return Z.valueOf(p);
      }
      p = mPrime.prevPrime(p);
    }
    return Z.ZERO;
  }
}
