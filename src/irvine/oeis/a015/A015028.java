package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015028 q-factorial numbers for q=-13.
 * @author Sean A. Irvine
 */
public class A015028 extends Sequence0 {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
    } else {
      mT = mT.multiply(-13);
      mA = mA.multiply(mT.subtract(1)).divide(-14);
    }
    return mA;
  }
}
