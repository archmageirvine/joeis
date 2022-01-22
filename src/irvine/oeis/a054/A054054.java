package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A054054 Smallest digit of n.
 * @author Sean A. Irvine
 */
public class A054054 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    for (int k = 0; true; ++k) {
      if (cnts[k] != 0) {
        return Z.valueOf(k);
      }
    }
  }
}
