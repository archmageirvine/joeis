package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002397 Coefficients for step-by-step integration.
 * @author Sean A. Irvine
 */
public class A002397 implements Sequence {

  private Z mF = Z.ONE;
  private Z mLcm = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
      mLcm = mLcm.lcm(Z.valueOf(mN + 1));
    }
    return mF.multiply(mLcm);
  }
}

