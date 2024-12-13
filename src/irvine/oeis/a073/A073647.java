package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073565.
 * @author Sean A. Irvine
 */
public class A073647 extends Sequence1 {

  private static final String[] REPLACEMENTS = {"0", "1", "2", "3", "22", "5", "23", "7", "222", "33"};
  private long mN = 0;

  @Override
  public Z next() {
    final StringBuilder sb = new StringBuilder();
    final String s = String.valueOf(++mN);
    for (int k = 0; k < s.length(); ++k) {
      sb.append(REPLACEMENTS[s.charAt(k) - '0']);
    }
    return new Z(sb);
  }
}
