package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064397 Numbers n such that prime(n) + prime(n+1) is a square.
 * @author Sean A. Irvine
 */
public class A064397 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long q = mP;
      mP = mPrime.nextPrime(mP);
      if (Predicates.SQUARE.is(q + mP)) {
        return Z.valueOf(mN);
      }
    }
  }
}

