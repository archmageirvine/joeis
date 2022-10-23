package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005061 a(n) = 4^n - 3^n.
 * @author Sean A. Irvine
 */
public class A005061 extends Sequence0 {

  private Z mA = null;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(4);
      mB = mB.multiply(3);
    }
    return mA.subtract(mB);
  }
}

