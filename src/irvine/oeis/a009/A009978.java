package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009978 Powers of 34.
 * @author Sean A. Irvine
 */
public class A009978 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(34);
    return mA;
  }
}
