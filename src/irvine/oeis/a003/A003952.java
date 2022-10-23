package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003952 Expansion of g.f.: (1+x)/(1-9*x).
 * @author Sean A. Irvine
 */
public class A003952 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.TEN;
    } else {
      mA = mA.multiply(9);
    }
    return mA;
  }
}
