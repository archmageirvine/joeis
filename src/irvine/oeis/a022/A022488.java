package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022488 Describe previous term from the right (method B - initial term is 2).
 * @author Sean A. Irvine
 */
public class A022488 extends Sequence1 {

  private Z mPrev = null;

  static Z describe(final Z n) {
    final String s = n.toString();
    final StringBuilder sb = new StringBuilder();
    int c = 1;
    char b = s.charAt(s.length() - 1);
    for (int k = s.length() - 2; k >= 0; --k) {
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
