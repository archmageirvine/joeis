package irvine.oeis.a115;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A323812.
 * @author Sean A. Irvine
 */
public class A115396 extends Sequence1 {

  // todo does not reproduce data

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long p = mN;
    while (true) {
      p = mPrime.nextPrime(p);
      if (Predicates.SEMIPRIME.is(p - mN) && Predicates.SEMIPRIME.is(p + mN)) {
        return Z.valueOf(p);
      }
    }
  }
}
