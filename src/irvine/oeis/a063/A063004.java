package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063003.
 * @author Sean A. Irvine
 */
public class A063004 extends Sequence0 {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply2();
    while (mA.compareTo(mT) < 0) {
      mA = mA.multiply(3);
    }
    return mA.subtract(mT);
  }
}

