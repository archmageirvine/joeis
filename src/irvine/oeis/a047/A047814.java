package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047814 Largest prime substring of n, or 0 if no such substring exists.
 * @author Sean A. Irvine
 */
public class A047814 extends Sequence0 {

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
        if (t.compareTo(best) > 0 && new Z(t).isProbablePrime()) {
          best = t;
        }
      }
      if (!best.isEmpty()) {
        return new Z(best);
      }
    }
    return Z.ZERO;
  }
}
