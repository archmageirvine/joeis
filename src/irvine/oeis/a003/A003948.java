package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003948 Expansion of <code>(1+x)/(1-5*x)</code>.
 * @author Sean A. Irvine
 */
public class A003948 implements Sequence {

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
