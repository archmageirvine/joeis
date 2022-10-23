package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A055639 Number of nonzero digits of n which are not factors of n.
 * @author Sean A. Irvine
 */
public class A055639 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(++mN);
    int c = 0;
    for (int k = 1; k < cnts.length; ++k) {
      if (mN % k != 0) {
        c += cnts[k];
      }
    }
    return Z.valueOf(c);
  }
}

