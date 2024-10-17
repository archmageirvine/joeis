package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003945 Expansion of g.f. (1+x)/(1-2*x).
 * @author Sean A. Irvine
 */
public class A003945 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.THREE;
    } else {
      mA = mA.multiply2();
    }
    return mA;
  }
}
