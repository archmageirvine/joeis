package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;
import irvine.util.string.StringUtils;

/**
 * A080634 Start with a(1)=1. Then, for n&gt;1, choose a(n)=1 or 2 so as to minimize the longest arithmetic progression in either S1(n) or S2(n), where S1(n)={k|a(k)=1,1&lt;=k&lt;=n} and S2(n)={k|a(k)=2,1&lt;=k&lt;=n}.
 * @author Sean A. Irvine
 */
public class A080634 extends Sequence1 {

  // Includes some messy guesses about how to handle tie-breaking

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final LongDynamicBooleanArray mS = new LongDynamicBooleanArray(); // set bits for S2
  private long mN = 0;
  private long mS1Length = 0;
  private long mS2Length = 0;
  private boolean mPrevWas2 = true; // Needed for tie-breaking

  private long getProgressionLength(final boolean side, final long n) {
    long best = 1;
    for (long k = n - 1; k > 0; --k) {
      if (mS.isSet(k) == side) {
        final long d = n - k;
        long cnt = 2;
        long j = k - d;
        while (j > 0 && mS.isSet(j) == side) {
          ++cnt;
          j -= d;
        }
        if (cnt > best) {
          best = cnt;
        }
      }
    }
    return best;
  }

  private String getS(final boolean side, final long n) {
    final StringBuilder sb = new StringBuilder("{");
    for (int k = 1; k <= n; ++k) {
      if (mS.isSet(k) == side) {
        sb.append(k).append(",");
      }
    }
    return sb.append("}").toString();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long len1 = getProgressionLength(false, mN);
    final long len2 = getProgressionLength(true, mN);
    if (mVerbose) {
      StringUtils.message(mN + " L1=" + mS1Length + " L2=" + mS2Length + " len1=" + len1 + " len2=" + len2 + " S1=" + getS(false, mN - 1) + " S2=" + getS(true, mN - 1));
    }
    if (len2 > len1 || (len2 == len1 && mPrevWas2)) {
      mS1Length = len1;
      mPrevWas2 = false;
      return Z.ONE;
    } else {
      mS2Length = len2;
      mS.set(mN);
      mPrevWas2 = true;
      return Z.TWO;
    }
  }
}
