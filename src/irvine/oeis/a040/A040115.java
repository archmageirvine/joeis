package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A040115.
 * @author Sean A. Irvine
 */
public class A040115 implements Sequence {

  private long mN = 9;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final StringBuilder sb = new StringBuilder();
    for (int m = 1; m < s.length(); ++m) {
      sb.append(Math.abs(s.charAt(m) - s.charAt(m - 1)));
    }
    return new Z(sb);
  }
}
