package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015013 q-factorial numbers for q=-2.
 * @author Sean A. Irvine
 */
public class A015013 extends Sequence0 {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
    } else {
      mT = mT.multiply(-2);
      mA = mA.multiply(mT.subtract(1)).divide(-3);
    }
    return mA;
  }
}
