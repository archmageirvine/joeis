package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A071710.
 * @author Sean A. Irvine
 */
public class A071710 extends Sequence2 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private long mVerboseReport = 100000;
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final Fast mPrime = new Fast();
  private long mP = 1;
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      mP = mPrime.nextPrime(mP);
      final long p1 = mP - 1;
      int w = 2; // 0!, 1! always solutions
      for (long f = 1, k = 2; k < mP; ++k) {
        f *= k;
        f %= mP;
        if (f == 1 || f == p1) {
          ++w;
        }
      }
      if (mFirsts.get(w) == 0) {
        mFirsts.set(w, mP);
      }
      if (mVerbose && mP > mVerboseReport) {
        mVerboseReport += 100000;
        StringUtils.message("Search completed to " + mP);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
