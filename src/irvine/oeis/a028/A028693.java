package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028693 24-factorial numbers.
 * @author Sean A. Irvine
 */
public class A028693 extends Sequence1 {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
    } else {
      mT = mT.multiply(24);
      mA = mA.multiply(mT.subtract(1));
    }
    return mA;
  }
}
