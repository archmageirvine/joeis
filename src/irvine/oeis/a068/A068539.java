package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.string.StringUtils;

/**
 * A051043.
 * @author Sean A. Irvine
 */
public class A068539 extends Sequence0 {

  private int mN = -1;
  private long mLim = 1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final long s = mLim;
    mLim *= 5;
    for (long m = s; m < mLim; ++m) {
      if (StringUtils.isCubeFreeWord(Long.toString(m, 5))) {
        sum = sum.add(5);
      }
    }
    return sum.divide(4);
  }
}
