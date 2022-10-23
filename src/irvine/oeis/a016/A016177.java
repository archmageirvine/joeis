package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016177 a(n) = 8^n - 7^n.
 * @author Sean A. Irvine
 */
public class A016177 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(8);
    mB = mB == null ? Z.ONE : mB.multiply(7);
    return mA.subtract(mB);
  }
}
