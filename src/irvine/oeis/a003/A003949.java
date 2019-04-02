package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003949 G.f.: (1+x)/(1-6*x).
 * @author Sean A. Irvine
 */
public class A003949 implements Sequence {

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
