package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A049192 Start with 1. Convert to base 2, describe it in base 2, convert to base 10.
 * @author Sean A. Irvine
 */
public class A049192 extends Sequence1 {

  private Z mA = null;

  /**
   * Describe the number using counts in the specified base.
   * @param s number to describe
   * @param base base
   * @return description of the number
   */
  static Z describe(final String s, final int base) {
    final StringBuilder sb = new StringBuilder();
    int k = 0;
    while (k < s.length()) {
      final char c = s.charAt(k);
      int cnt = 1;
      while (++k < s.length() && s.charAt(k) == c) {
        ++cnt;
      }
      sb.append(Integer.toString(cnt, base)).append(c);
    }
    return new Z(sb);
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : describe(mA.toString(2), 2);
    return mA;
  }
}

