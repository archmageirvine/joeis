package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028694 25-factorial numbers.
 * @author Sean A. Irvine
 */
public class A028694 implements Sequence {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (mT == null) {
      mT = Z.ONE;
    } else {
      mT = mT.multiply(25);
      mA = mA.multiply(mT.subtract(1));
    }
    return mA;
  }
}
