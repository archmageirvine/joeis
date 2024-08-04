package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A040115 Concatenate absolute values of differences between adjacent digits of n.
 * @author Sean A. Irvine
 */
public class A040115 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN < 10) {
      return Z.ZERO;
    }
    final String s = String.valueOf(mN);
    final StringBuilder sb = new StringBuilder();
    for (int m = 1; m < s.length(); ++m) {
      sb.append(Math.abs(s.charAt(m) - s.charAt(m - 1)));
    }
    return new Z(sb);
  }
}
