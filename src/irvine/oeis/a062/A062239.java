package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062204.
 * @author Sean A. Irvine
 */
public class A062239 extends Sequence1 {

  private static final int[] REPLACEMENTS = {2, 3, 5, 7};
  private long mN = 3;
  private long mLim = 8;

  private boolean is(final String s, final Z v) {
    for (int k = 1; k < s.length(); ++k) {
      if (v.mod(REPLACEMENTS[s.charAt(k) - '0']) != 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (++mN == mLim) {
        mLim *= 4;
        mN = mLim / 2;
      }
      final String s = Long.toString(mN, 4);
      Z v = Z.ZERO;
      for (int k = 1; k < s.length(); ++k) {
        v = v.multiply(10).add(REPLACEMENTS[s.charAt(k) - '0']);
      }
      if (is(s, v)) {
        return v;
      }
    }
  }
}

