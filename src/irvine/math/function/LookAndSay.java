package irvine.math.function;

import irvine.math.z.Z;

/**
 * Describe the number. For example, 3445, is one 3, two 4s, one 5 to give 132415.
 * @author Sean A. Irvine
 */
class LookAndSay extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    final String s = n.toString();
    final StringBuilder sb = new StringBuilder();
    int c = 1;
    char b = s.charAt(0);
    for (int k = 1; k < s.length(); ++k) {
      final char d = s.charAt(k);
      if (d != b) {
        sb.append(c).append(b);
        b = d;
        c = 1;
      } else {
        ++c;
      }
    }
    sb.append(c).append(b);
    return new Z(sb);
  }
}
