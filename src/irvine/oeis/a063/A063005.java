package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063003.
 * @author Sean A. Irvine
 */
public class A063005 extends Sequence0 {

  private Z mT = null;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mT = mT == null ? Z.ONE : mT.multiply2();
    Z a = mA;
    while (a.compareTo(mT) <= 0) {
      mA = a;
      a = a.multiply(3);
    }
    return mT.subtract(mA);
  }
}

