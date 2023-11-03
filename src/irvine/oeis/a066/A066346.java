package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A066346 Number of winning binary "same game" templates with ternary digits totaling n.
 * @author Sean A. Irvine
 */
public class A066346 extends Sequence0 {

  private long mN = -1;
  private long mCount = 0;

  static boolean isWinning(final String s) {
    if (s.isEmpty()) {
      return true;
    }
    for (int k = 0; k < s.length() - 1; ++k) {
      final char c = s.charAt(k);
      if (s.charAt(k + 1) == c) {
        int j = k + 2;
        while (j < s.length() && s.charAt(j) == c) {
          ++j;
        }
        if (isWinning(s.substring(0, k) + s.substring(j))) {
          return true;
        }
        k = j - 1;
      }
    }
    return false;
  }

  private void search(final long remaining, final StringBuilder sb, final char c) {
    if (remaining == 0) {
      if (isWinning(sb.toString())) {
        ++mCount;
      }
      return;
    }
    final int pos = sb.length();
    sb.append(c);
    search(remaining - 1, sb, c == '1' ? '0' : '1');
    if (remaining > 1) {
      sb.append(c);
      search(remaining - 2, sb, c == '1' ? '0' : '1');
    }
    sb.setLength(pos);
  }

  @Override
  public Z next() {
    mCount = 0;
    search(++mN, new StringBuilder(), '1');
    return Z.valueOf(mCount);
  }
}
