package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005056 a(n) = 3^n + 2^n - 1.
 * @author Sean A. Irvine
 */
public class A005056 extends Sequence0 {

  private Z mA = null;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(3);
      mB = mB.multiply2();
    }
    return mA.add(mB).subtract(1);
  }
}

