package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;
import irvine.util.string.StringUtils;

/**
 * A028906.
 * @author Sean A. Irvine
 */
public class A028906 extends A000040 {

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(super.next());
    final StringBuilder sb = new StringBuilder();
    for (int k = 9; k >= 0; --k) {
      sb.append(StringUtils.rep((char) ('0' + k), cnts[k]));
    }
    return new Z(sb);
  }
}
