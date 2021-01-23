package irvine.oeis.a035;

import irvine.math.z.Z;

/**
 * A035253 Second differences are 2,2,1,2,1,1,2,1,1,1,2,1,1,1,1,2,1,1,1,1,1,2,.. (A035214).
 * @author Sean A. Irvine
 */
public class A035253 extends A035214 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.FOUR;
    } else if (mB == null) {
      mB = Z.THREE;
      mA = Z.ONE;
    } else {
      mB = mB.subtract(super.next());
      mA = mA.subtract(mB);
    }
    return mA;
  }
}

