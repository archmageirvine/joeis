package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A056967 Write what is described (putting a leading zero on numbers which have an odd number of digits).
 * @author Sean A. Irvine
 */
public class A056967 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = Long.toString(++mN);
    final StringBuilder sb = new StringBuilder();
    for (int k = (s.length() & 1) == 0 ? 0 : -1; k < s.length(); k += 2) {
      final int c = k < 0 ? 0 : s.charAt(k) - '0';
      sb.append(StringUtils.rep(s.charAt(k + 1), c));
    }
    return sb.length() == 0 ? Z.ZERO : new Z(sb);
  }
}
