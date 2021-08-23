package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A028445 Number of cubefree words of length n on two letters.
 * @author Sean A. Irvine
 */
public class A028445 implements Sequence {

  // After M. F. Hasler

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    final long lim = 1L << mN;
    for (long m = 1L << (mN - 1); m < lim; ++m) {
      if (StringUtils.isCubeFreeWord(Long.toBinaryString(m))) {
        sum = sum.add(2);
      }
    }
    return sum;
  }
}
