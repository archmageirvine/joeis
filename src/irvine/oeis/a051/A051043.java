package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A051043 Number of quaternary cubefree words of length n.
 * @author Sean A. Irvine
 */
public class A051043 extends Sequence0 {

  private int mN = -1;
  private long mLim = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final long s = mLim;
    mLim *= 4;
    for (long m = s; m < mLim; ++m) {
      if (StringUtils.isCubeFreeWord(Long.toString(m, 4))) {
        sum = sum.add(4);
      }
    }
    return sum.divide(3);
  }
}
