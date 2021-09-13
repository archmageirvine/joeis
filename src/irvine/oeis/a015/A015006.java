package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015006 q-factorial numbers for q=7.
 * @author Sean A. Irvine
 */
public class A015006 implements Sequence {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
    } else {
      mT = mT.multiply(7);
      mA = mA.multiply(mT.subtract(1)).divide(6);
    }
    return mA;
  }
}
