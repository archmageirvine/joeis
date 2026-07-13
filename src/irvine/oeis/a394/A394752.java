package irvine.oeis.a394;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicIntArray;
import irvine.util.string.StringUtils;

/**
 * A394752 allocated for Sijie Wu.
 * @author Sean A. Irvine
 */
public class A394752 extends Sequence1 {

  private static final int[] DIGITS = {4, 0, 4};

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicIntArray mGrundy = new LongDynamicIntArray();
  private long mN = 0;
  private long mPos = 0;

  @Override
  public Z next() {
    if (mPos == 0) {
      mPos = 1;
      return Z.ZERO;
    }
    while (true) {
      ++mN;
      if (mVerbose && mN % 10000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
      final HashSet<Integer> reach = new HashSet<>();
      for (int i = 1; i <= DIGITS.length && i <= mN; ++i) {
        final int d = DIGITS[i - 1];
        if ((d & 4) != 0) {
          final long ni = mN - i;
          for (long a = 1; a <= ni / 2; ++a) {
            final long b = ni - a;
            if (b >= 1) {
              reach.add(mGrundy.get(a) ^ mGrundy.get(b));
            }
          }
        }
      }
      int g = 0;
      while (reach.contains(g)) {
        ++g;
      }
      mGrundy.set(mN, g);
      if (g == 0) {
        mPos = mN + 1;
        return Z.valueOf(mN);
      }
    }
  }
}
