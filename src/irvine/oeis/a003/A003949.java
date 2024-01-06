package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003949 Expansion of g.f. (1+x)/(1-6*x).
 * @author Sean A. Irvine
 */
public class A003949 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.SEVEN;
    } else {
      mA = mA.multiply(6);
    }
    return mA;
  }
}
