package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007651 Describe the previous <code>term!</code> (method <code>B -</code> initial term is <code>1)</code>.
 * @author Sean A. Irvine
 */
public class A007651 implements Sequence {

  private static String lookAndSayFreqLast(final String n) {
    final StringBuilder sb = new StringBuilder();
    int cnt = 0;
    char p = 0;
    for (int k = 0; k < n.length(); ++k) {
      final char c = n.charAt(k);
      if (c == p) {
        ++cnt;
      } else {
        if (p != 0) {
          sb.append(p).append(cnt);
        }
        p = c;
        cnt = 1;
      }
    }
    sb.append(p).append(cnt);
    return sb.toString();
  }

  private String mA = null;

  @Override
  public Z next() {
    mA = mA == null ? "1" : lookAndSayFreqLast(mA);
    return new Z(mA);
  }
}
