package irvine.oeis.a384;

import irvine.math.LongUtils;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A384430 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A384430 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 2;
  private int mC = 1;
  private final DynamicLongArray mCubes = new DynamicLongArray();

  private long cube(final int n) {
    while (n >= mC) {
      mCubes.set(mC, (long) mC * mC * mC);
      ++mC;
    }
    return mCubes.get(n);
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      if (++mM > 6208) {
        throw new UnsupportedOperationException();
      }
      int cnt = 0;
      final long m5 = LongUtils.pow(mM, 5);
      for (int x = 1; 4 * cube(x) < m5; ++x) {
        final long a = m5 - cube(x);
        for (int y = x + 1; 3 * cube(y) < a; ++y) {
          final long b = a - cube(y);
          for (int z = y + 1; 2 * cube(z) < b; ++z) {
            final long c = b - cube(z);
            if (Predicates.CUBE.is(c)) {
              ++cnt;
            }
          }
        }
      }
      if (mFirsts.get(cnt) == 0) {
        if (mVerbose) {
          StringUtils.message("First k with " + cnt + " solutions is " + mM);
        }
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

