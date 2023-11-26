package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a003.A003285;

/**
 * A064932 Period of the continued fraction for sqrt(3^(2n+1)).
 * @author Sean A. Irvine
 */
public class A064932 extends A003285 {

  private Z mA = Z.THREE;

  @Override
  public Z next() {
    mA = mA.multiply(9);
    return period(mA);
  }
}
