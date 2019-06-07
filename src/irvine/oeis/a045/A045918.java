package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045918 Describe <code>n</code>. Also called the "Say What You See" or "Look and Say" sequence <code>LS(n)</code>.
 * @author Sean A. Irvine
 */
public class A045918 implements Sequence {

  /**
   * Return the look-and-say function of a number.  Assumes an integer
   * for input.
   *
   * @param n number
   * @return look-and-say number
   */
  public static String lookAndSay(final String n) {
    final StringBuilder sb = new StringBuilder();
    int cnt = 0;
    char p = 0;
    for (int k = 0; k < n.length(); ++k) {
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

  /**
   * Return the look-and-say function of a number.
   *
   * @param n number
   * @return look-and-say number
   */
  public static String lookAndSay(final long n) {
    return lookAndSay(String.valueOf(n));
  }

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(lookAndSay(++mN));
  }
}
