package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A070655.
 * @author Sean A. Irvine
 */
public class A070734 extends Sequence3 {

  private int mN = 2;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return mF.multiply(Z.THREE.add(Z.NEG_ONE.pow(mN))).divide(4);
  }
}
