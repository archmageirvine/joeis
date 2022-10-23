package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009970 Powers of 26.
 * @author Sean A. Irvine
 */
public class A009970 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(26);
    return mA;
  }
}
