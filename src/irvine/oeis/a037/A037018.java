package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A037018 Conjecturally, largest k with no prime in [ k, k(1+1/n) ].
 * @author Sean A. Irvine
 */
public class A037018 extends Sequence2 {

  // Possibly this heuristic should scale with mN
  private static final long HEURISTIC = 1000;
  private final Fast mPrime = new Fast();
  private long mN = 1;

  private boolean isNoPrime(final long k, final long n) {
    final long limit = k * (n + 1) / n;
    return mPrime.nextPrime(k - 1) > limit;
  }

  @Override
  public Z next() {
    ++mN;
    long best = 1;
    long k = best;
    while (k < best + HEURISTIC) {
      if (isNoPrime(k, mN)) {
        best = k;
      }
      ++k;
    }
    return Z.valueOf(best);
  }
}
