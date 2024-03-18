package irvine.oeis.a068;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A068843 Smallest prime in the first occurrence of a nondecreasing difference for a set of exactly n successive primes.
 * @author Sean A. Irvine
 */
public class A068843 extends Sequence1 {

  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      final long start = mP;
      int cnt = -1;
      long gap;
      long g = -1;
      do {
        gap = g;
        ++cnt;
        final long t = mP;
        mP = mPrime.nextPrime(mP);
        g = mP - t;
      } while (g >= gap);
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, start);
      }
      mP = mPrime.prevPrime(mP);
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
