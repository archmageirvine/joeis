package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022470.
 * @author Sean A. Irvine
 */
public class A022470 implements Sequence {

  private Z mPrev = null;

  private static Z describe(final Z n) {
    final String s = n.toString();
    final StringBuilder sb = new StringBuilder();
    int c = 1;
    char b = s.charAt(0);
    for (int k = 1; k < s.length(); ++k) {
      final char d = s.charAt(k);
      if (d != b) {
        sb.append(b).append(c);
        b = d;
        c = 1;
      } else {
        ++c;
      }
    }
    sb.append(b).append(c);
    return new Z(sb);
  }

  @Override
  public Z next() {
    mPrev = mPrev == null ? Z.TWO : describe(mPrev);
    return mPrev;
  }
}
