package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000079;
import irvine.util.string.StringUtils;

/**
 * A028909.
 * @author Sean A. Irvine
 */
public class A028909 extends A000079 {

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(super.next());
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k < cnts.length; ++k) {
      sb.append(StringUtils.rep((char) ('0' + k), cnts[k]));
    }
    return new Z(sb);
  }
}
