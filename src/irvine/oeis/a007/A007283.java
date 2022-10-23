package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007283 a(n) = 3*2^n.
 * @author Sean A. Irvine
 */
public class A007283 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply2();
    return mA;
  }
}
