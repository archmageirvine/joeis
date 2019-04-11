package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005060 <code>a(n) = 5^n - 4^n</code>.
 * @author Sean A. Irvine
 */
public class A005060 implements Sequence {

  private Z mA = null;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(5);
      mB = mB.multiply(4);
    }
    return mA.subtract(mB);
  }
}

