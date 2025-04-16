package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;

/**
 * A076749 Least number which is the sum of four nonnegative cubes (not necessarily distinct and including zero) in n ways.
 * @author Sean A. Irvine
 */
public class A076749 extends Sequence1 {

  private final long[] mCubes = new long[2097153]; // 2097152^3 = (2^31)^3 is the largest cube in 63 bits
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = -1;
  private int mS = 1;
  private int mCount = 0;

  private void count(final long remaining, int s, final int termsRemaining) {
    while (remaining < mCubes[s]) {
      --s;
    }
    if (termsRemaining == 1) {
      if (remaining == mCubes[s]) {
        ++mCount;
      }
    } else {
      for (int k = s; k >= 0; --k) {
        if (termsRemaining * mCubes[k] < remaining) {
          break;
        }
        count(remaining - mCubes[k], k, termsRemaining - 1);
      }
    }
  }

  private int count(final long n) {
    mCount = 0;
    count(n, mS, 4);
    return mCount;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO; // Avoid having to deal with 0s in mFirsts
    }
    while (mFirsts.get(mN) == 0) {
      ++mM;
      // Make sure cubes extends far enough
      while (mCubes[mS] < mM) {
        if (mCubes[mS] == 0) {
          mCubes[mS] = (long) mS * mS * mS;
        } else {
          ++mS;
        }
      }
      // Do the actual counting
      final int count = count(mM);
      if (mFirsts.get(count) == 0) {
        mFirsts.set(count, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}
