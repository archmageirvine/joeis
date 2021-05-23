package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A047813 Largest palindromic substring of n.
 * @author Sean A. Irvine
 */
public class A047813 implements Sequence {

  private long mN = -1;
  private int mDigits = 1;
  private long mStepDigits = 10;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    if (mN == mStepDigits) {
      mStepDigits *= 10;
      ++mDigits;
    }
    String best = "";
    for (int d = mDigits; d >= 1; --d) {
      for (int start = 0; start <= s.length() - d; ++start) {
        final String t = s.substring(start, start + d);
        if (StringUtils.isPalindrome(t) && t.compareTo(best) > 0) {
          best = t;
        }
      }
      if (!best.isEmpty()) {
        return new Z(best);
      }
    }
    throw new RuntimeException();
  }
}
