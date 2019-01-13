package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000775.
 * @author Sean A. Irvine
 */
public class A000775 implements Sequence {

  private Z mPrev = Z.ONE;
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mPrev = mPrev.multiply(mN).add(mF.multiply(mN + 2));
      if (mN > 1) {
        mF = mF.multiply(mN);
      }
    }
    return mPrev;
  }
}
