package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A038769 Number of digits of n which are divisors of n.
 * @author Sean A. Irvine
 */
public class A038769 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final int[] cnts = ZUtils.digitCounts(mN);
    long c = 0;
    for (int d = 1; d < cnts.length; ++d) {
      if (cnts[d] > 0 && mN.mod(d) == 0) {
        c += cnts[d];
      }
    }
    return Z.valueOf(c);
  }
}
