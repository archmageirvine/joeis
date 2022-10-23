package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028692 23-factorial numbers.
 * @author Sean A. Irvine
 */
public class A028692 extends Sequence0 {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
    } else {
      mT = mT.multiply(23);
      mA = mA.multiply(mT.subtract(1));
    }
    return mA;
  }
}
