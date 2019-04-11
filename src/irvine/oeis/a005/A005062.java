package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005062 <code>a(n) = 6^n - 5^n</code>.
 * @author Sean A. Irvine
 */
public class A005062 implements Sequence {

  private Z mA = null;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(6);
      mB = mB.multiply(5);
    }
    return mA.subtract(mB);
  }
}

