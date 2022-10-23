package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003948 Expansion of (1+x)/(1-5*x).
 * @author Sean A. Irvine
 */
public class A003948 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.SIX;
    } else {
      mA = mA.multiply(5);
    }
    return mA;
  }
}
