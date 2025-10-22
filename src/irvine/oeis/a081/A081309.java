package irvine.oeis.a081;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081309 Smallest prime p such that n-p is a 3-smooth number, a(n)=0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A081309 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p >= mN) {
        return Z.ZERO;
      }
      if (Predicates.SMOOTH.is(3, mN - p)) {
        return Z.valueOf(p);
      }
    }
  }
}

