package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A047842 Describe n (count digits in order of increasing value, ignoring missing digits).
 * @author Sean A. Irvine
 */
public class A047842 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < cnts.length; ++k) {
      if (cnts[k] > 0) {
        sb.append(cnts[k]).append(k);
      }
    }
    return new Z(sb);
  }
}
