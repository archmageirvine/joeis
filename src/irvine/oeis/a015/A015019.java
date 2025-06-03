package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015019 q-factorial numbers for q=-6.
 * @author Sean A. Irvine
 */
public class A015019 extends Sequence0 {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
    } else {
      mT = mT.multiply(-6);
      mA = mA.multiply(mT.subtract(1)).divide(-7);
    }
    return mA;
  }
}
