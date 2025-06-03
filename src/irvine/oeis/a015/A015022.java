package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A015022 q-factorial numbers for q=-8.
 * @author Sean A. Irvine
 */
public class A015022 extends Sequence0 {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
    } else {
      mT = mT.multiply(-8);
      mA = mA.multiply(mT.subtract(1)).divide(-9);
    }
    return mA;
  }
}
