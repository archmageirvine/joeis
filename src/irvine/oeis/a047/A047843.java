package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A047843 Describe n: give frequency of each digit, by increasing size; mention also missing digits between the smallest and largest one.
 * @author Sean A. Irvine
 */
public class A047843 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    final StringBuilder sb = new StringBuilder();
    int lim = cnts.length;
    while (cnts[lim - 1] == 0) {
      --lim;
    }
    for (int k = 0; k < lim; ++k) {
      if (cnts[k] > 0 || sb.length() > 0) {
        sb.append(cnts[k]).append(k);
      }
    }
    return new Z(sb);
  }
}
