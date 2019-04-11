package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005061 <code>a(n) = 4^n - 3^n</code>.
 * @author Sean A. Irvine
 */
public class A005061 implements Sequence {

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

