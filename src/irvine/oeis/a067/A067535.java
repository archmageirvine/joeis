package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a005.A005117;

/**
 * A067180.
 * @author Sean A. Irvine
 */
public class A067535 extends A005117 {

  private Z mS = super.next();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mS.equals(mN)) {
      mS = super.next();
      return mN;
    }
    return mS;
  }
}
