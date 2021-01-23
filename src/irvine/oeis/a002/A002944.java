package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002944 a(n) = LCM(1,2,...,n) / n.
 * @author Sean A. Irvine
 */
public class A002944 implements Sequence {

  protected Z mN = Z.ZERO;
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    mLcm = mLcm.lcm(mN);
    return mLcm.divide(mN);
  }
}
