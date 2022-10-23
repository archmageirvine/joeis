package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009985 Powers of 41.
 * @author Sean A. Irvine
 */
public class A009985 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(41);
    return mA;
  }
}
