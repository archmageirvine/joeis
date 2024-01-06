package irvine.oeis.a067;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067694 Minimum number of distinct parts in a self-conjugate partition of n, or 0 if n=2.
 * @author Sean A. Irvine
 */
public class A067694 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0 || mN == 2) {
      return Z.ZERO;
    }
    if (LongUtils.isSquare(mN)) {
      return Z.ONE;
    }
    if ((mN & 3) == 2) {
      return Z.THREE;
    }
    return Z.TWO;
  }
}
