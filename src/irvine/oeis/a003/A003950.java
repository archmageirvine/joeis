package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003950 Expansion of g.f.: (1+x)/(1-7*x).
 * @author Sean A. Irvine
 */
public class A003950 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.EIGHT;
    } else {
      mA = mA.multiply(7);
    }
    return mA;
  }
}
