package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009968 Powers of 24: a(n) = 24^n.
 * @author Sean A. Irvine
 */
public class A009968 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(24);
    return mA;
  }
}
