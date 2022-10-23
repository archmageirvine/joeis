package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003946 Expansion of (1+x)/(1-3*x).
 * @author Sean A. Irvine
 */
public class A003946 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.FOUR;
    } else {
      mA = mA.multiply(3);
    }
    return mA;
  }
}
