package irvine.oeis.a032;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A032524 Arrange digits of primes in ascending order (omitting any that contain 0's), sort list, remove duplicates.
 * @author Sean A. Irvine
 */
public class A032524 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mLim = 1;

  private Z sortDigits(final long p) {
    final Z pp = Z.valueOf(p);
    if (ZUtils.containsZero(pp)) {
      return null;
    }
    return ZUtils.sortDigitsAscending(Z.valueOf(p));
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mLim *= 10;
      while (mP < mLim) {
        final Z pp = sortDigits(mP);
        if (pp != null) {
          mA.add(pp);
        }
        mP = mPrime.nextPrime(mP);
      }
    }
    return mA.pollFirst();
  }
}
