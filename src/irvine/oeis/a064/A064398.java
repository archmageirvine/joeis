package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064398 Numbers n such that p(n) + p(n+1) is a square and n is prime.
 * @author Sean A. Irvine
 */
public class A064398 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long q = mP;
      mP = mPrime.nextPrime(mP);
      if (mPrime.isPrime(mN) && LongUtils.isSquare(q + mP)) {
        return Z.valueOf(mN);
      }
    }
  }
}

