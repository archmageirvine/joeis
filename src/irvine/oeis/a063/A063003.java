package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063003.
 * @author Sean A. Irvine
 */
public class A063003 extends Sequence0 {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply(3);
    while (mA.compareTo(mT) < 0) {
      mA = mA.multiply2();
    }
    return mA.subtract(mT);
  }
}

