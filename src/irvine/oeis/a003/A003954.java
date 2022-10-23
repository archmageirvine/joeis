package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003954 Expansion of g.f.: (1+x)/(1-11*x).
 * @author Sean A. Irvine
 */
public class A003954 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.valueOf(12);
    } else {
      mA = mA.multiply(11);
    }
    return mA;
  }
}
