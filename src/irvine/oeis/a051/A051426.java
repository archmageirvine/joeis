package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051426 Least common multiple of {2, 4, 6, ..., 2n}.
 * @author Sean A. Irvine
 */
public class A051426 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mLcm = Z.ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    mLcm = mLcm.lcm(mN);
    return mLcm;
  }
}
