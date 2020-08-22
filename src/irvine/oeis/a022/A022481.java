package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022481 Describe previous term from the right (method B - initial term is 1).
 * @author Sean A. Irvine
 */
public class A022481 implements Sequence {

  private Z mPrev = null;

  private static Z describe(final Z n) {
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
    mPrev = mPrev == null ? Z.ONE : describe(mPrev);
    return mPrev;
  }
}
