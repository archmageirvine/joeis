package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A077127 a(0) = 1, a(1) = 2, a(n) = smallest number other than n, non-coprime to n and not occurring earlier.
 * @author Sean A. Irvine
 */
public class A077127 extends Sequence0 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mN = -1;
  private long mLeastUnused = 3;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      return Z.TWO;
    }
    while (mSeen.isSet(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    while (true) {
      if (k != mN && Functions.GCD.l(k, mN) != 1 && !mSeen.isSet(k)) {
        mSeen.set(k);
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

