package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015027 q-factorial numbers for q=-12.
 * @author Sean A. Irvine
 */
public class A015027 extends Sequence1 {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
    } else {
      mT = mT.multiply(-12);
      mA = mA.multiply(mT.subtract(1)).divide(-13);
    }
    return mA;
  }
}
