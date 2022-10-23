package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A057169 Least integer with the same nonzero decimal digits as n and one more 0 digit.
 * @author Sean A. Irvine
 */
public class A057169 extends Sequence1 {

  private long mN = 0;
  
  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    final StringBuilder sb = new StringBuilder();
    for (int k = 1; k < cnts.length; ++k) {
      if (cnts[k] > 0) {
        if (sb.length() == 0) {
          sb.append(k);
          sb.append(StringUtils.rep('0', cnts[0] + 1));
          sb.append(StringUtils.rep((char) ('0' + k), cnts[k] - 1));
        } else {
          sb.append(StringUtils.rep((char) ('0' + k), cnts[k]));
        }
      }
    }
    return new Z(sb);
  }
}

