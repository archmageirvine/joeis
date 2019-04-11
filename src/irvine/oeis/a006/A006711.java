package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006711 Describe previous term from the right (method A - initial term is <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A006711 implements Sequence {

  private String mPrev = null;

  /**
   * Return the look-and-say function of a number.  Assumes an integer
   * for input.
   *
   * @param n number
   * @return look-and-say number
   */
  private static String lookAndSayReverse(final String n) {
    final StringBuilder sb = new StringBuilder();
    int cnt = 0;
    char p = 0;
    for (int k = n.length() - 1; k >= 0; --k) {
      final char c = n.charAt(k);
      if (c == p) {
        ++cnt;
      } else {
        if (p != 0) {
          sb.append(cnt).append(p);
        }
        p = c;
        cnt = 1;
      }
    }
    sb.append(cnt).append(p);
    return sb.toString();
  }

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = "1";
    } else {
      mPrev = lookAndSayReverse(mPrev);
    }
    return new Z(mPrev);
  }
}

