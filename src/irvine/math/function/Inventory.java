package irvine.math.function;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;

/**
 * Describe the number. For example, 3445, is one 3, two 4s, one 5 to give 132415.
 * @author Sean A. Irvine
 */
class Inventory extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    final int[] cnts = ZUtils.digitCounts(n);
    final String s = n.toString();
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < s.length(); ++k) {
      final int j = s.charAt(k) - '0';
      if (cnts[j] > 0) {
        sb.append(cnts[j]).append(j);
        cnts[j] = 0; // so we don't report again
      }
    }
    return new Z(sb);
  }
}
