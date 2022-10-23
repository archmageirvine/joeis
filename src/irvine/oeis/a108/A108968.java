package irvine.oeis.a108;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.English;

/**
 * A108968 Self-ranked numbers.
 * @author Sean A. Irvine
 */
public class A108968 extends Sequence0 {

  private static final String[] CODE = new String[26];
  static {
    for (int k = 0; k < CODE.length; ++k) {
      CODE[k] = String.valueOf(k + 1);
    }
  }

  private int mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    while (true) {
      final String s = English.SINGLETON.toText(++mN);
      sb.setLength(0);
      for (int k = 0; k < s.length(); ++k) {
        final char c = s.charAt(k);
        if (c >= 'a' && c <= 'z') {
          sb.append(CODE[c - 'a']);
        }
      }
      if (sb.toString().contains(String.valueOf(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

