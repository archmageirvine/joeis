package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002397 a(n) = n! * lcm({1, 2, ..., n+1}).
 * @author Sean A. Irvine
 */
public class A002397 extends Sequence0 {

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

