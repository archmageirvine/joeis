package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005057 a(n) = 5^n - 2^n.
 * @author Sean A. Irvine
 */
public class A005057 extends Sequence0 {

  private Z mA = null;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(5);
      mB = mB.multiply2();
    }
    return mA.subtract(mB);
  }
}

