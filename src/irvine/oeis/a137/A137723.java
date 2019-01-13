package irvine.oeis.a137;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

/**
 * A137723.
 * @author Sean A. Irvine
 */
public class A137723 implements Sequence {

  private int mN = 0;
  private long mSearch = 9; // First decent gap is at 10

  private final DynamicLongArray mFirstGap = new DynamicLongArray();
  private final Fast mPrime = new Fast();

  private long findIt(final int n) {
    final long g = mFirstGap.get(n);
    if (g != 0) {
      return g;
    }
    while (true) {
      int gapSize = 0;
      final long searchStart = mSearch + 1;
      while (true) {
        final Z[] facs = Cheetah.factor(++mSearch).toZArray();
        boolean hasGap = false;
        for (int k = 0; k < facs.length - 1; ++k) {
          if (!mPrime.nextPrime(facs[k]).equals(facs[k + 1])) {
            hasGap = true;
            break;
          }
        }
        if (!hasGap) {
          break;
        }
        ++gapSize;
      }
      if (mFirstGap.get(gapSize) == 0) {
        mFirstGap.set(gapSize, searchStart);
      }
      if (gapSize == n) {
        return searchStart;
      }
    }
  }


  @Override
  public Z next() {
    return Z.valueOf(findIt(++mN));
  }

}

