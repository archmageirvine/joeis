package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016195 a(n) = 11^n - 10^n.
 * @author Sean A. Irvine
 */
public class A016195 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(11);
    mB = mB == null ? Z.ONE : mB.multiply(10);
    return mA.subtract(mB);
  }
}
