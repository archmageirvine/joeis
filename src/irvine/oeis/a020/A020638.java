package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001390;
import irvine.util.array.LongDynamicLongArray;

/**
 * A020638 Least inverse of <code>A001390</code>, or 0 if no inverse exists.
 * @author Sean A. Irvine
 */
public class A020638 implements Sequence {

  // This could do with a better way of detecting 0s which occur at
  // 8, 16, 27, 32 (i.e. perhaps p^b, b >= 3, but I don't know for sure).

  // How far to search ahead in powers of 2.  Make this higher if heuristic
  // failure is ever reported.  Bigger values will be slower though.
  private static final int HEURISTIC_FACTOR = 4;

  private final LongDynamicLongArray mInverse = new LongDynamicLongArray();
  private final A001390 mA = new A001390();
  private final Fast mPrime = new Fast();
  private long mP = 1;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mInverse.get(mN) == 0 && mN << HEURISTIC_FACTOR > mInverse.length()) {
      mP = mPrime.nextPrime(mP);
      final long a = mA.next().longValueExact();
      if (mInverse.get(a) == 0) {
        if (a < mN) {
          throw new UnsupportedOperationException("Heuristic failure detected");
        }
        mInverse.set(a, mP);
      }
    }
    return Z.valueOf(mInverse.get(mN));
  }
}
