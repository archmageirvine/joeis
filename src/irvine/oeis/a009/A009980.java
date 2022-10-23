package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009980 Powers of 36.
 * @author Sean A. Irvine
 */
public class A009980 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(36);
    return mA;
  }
}
