package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015026 q-factorial numbers for q=-11.
 * @author Sean A. Irvine
 */
public class A015026 extends Sequence1 {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
    } else {
      mT = mT.multiply(-11);
      mA = mA.multiply(mT.subtract(1)).divide(-12);
    }
    return mA;
  }
}
