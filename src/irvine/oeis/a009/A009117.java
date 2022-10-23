package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A009117 Expansion of e.g.f.: 1/2 + exp(-4*x)/2.
 * @author Sean A. Irvine
 */
public class A009117 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.equals(Z.ONE) ? Z.valueOf(-2) : mA.multiply(-4);
    return mA;
  }
}
