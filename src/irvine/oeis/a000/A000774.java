package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000774.
 * @author Sean A. Irvine
 */
public class A000774 implements Sequence {

  private Z mPrev = Z.ZERO;
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    mPrev = mPrev.multiply(++mN).add(mF);
    if (mN > 1) {
      mF = mF.multiply(mN);
    }
    return mPrev;
  }
}
