package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059009 Numbers having an odd number of zeros in their binary expansion.
 * @author Sean A. Irvine
 */
public class A059009 implements Sequence {

  private long mN = -1;
  private long mM = 0;
  private long mLim = 1;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ZERO;
    }
    while (true) {
      if (++mN == mLim) {
        mLim *= 2;
        ++mM;
      }
      if (((mM - Long.bitCount(mN)) & 1) == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

