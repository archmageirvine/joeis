package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007689 a(n) = 2^n + 3^n.
 * @author Sean A. Irvine
 */
public class A007689 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply2();
    mB = mB == null ? Z.ONE : mB.multiply(3);
    return mA.add(mB);
  }
}
