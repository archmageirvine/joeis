package irvine.oeis.a394;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A394623 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A394623 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 10;
  private long mLim = 100;

  private boolean is(final long p) {
    final int[] cnts = ZUtils.digitCounts(p);
    for (int d = 0; d < 10; d += 2) {
      if (cnts[d] != cnts[d + 1]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (mP >= mLim) {
        // odd length
        mP = mLim * 10;
        mLim = mP * 10;
      } else if (is(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}
