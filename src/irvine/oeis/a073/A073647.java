package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073647 In decimal representation of n, replace composite digits (4, 6, 8 and 9) with their concatenated prime factorizations (22, 23, 222 and 33).
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
