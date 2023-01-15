package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A061014 a(n) is the smallest number k such that k! contains k exactly n times.
 * @author Sean A. Irvine
 */
public class A061014 extends A000142 {

  private int mM = -1;
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private int count(final String s, final String t) {
    int c = 0;
    int pos = -1;
    while ((pos = s.indexOf(t, pos + 1)) >= 0) {
      ++c;
    }
    return c;
  }

  @Override
  public Z next() {
    if (++mM == 0) {
      return Z.ZERO;
    }
    while (mFirsts.get(mM) == 0) {
      final String s = super.next().toString();
      final int cnt = count(s, String.valueOf(mN));
      if (mFirsts.get(cnt) == 0) {
        mFirsts.set(cnt, mN);
        if (mVerbose) {
          StringUtils.message("Found a(" + cnt + ") = " + mN);
        }
      }
      if (mVerbose && mN % 1000 == 0) {
        StringUtils.message("Search completed to " + mN);
      }
    }
    return Z.valueOf(mFirsts.get(mM));
  }
}

