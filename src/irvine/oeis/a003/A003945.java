package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003945 Expansion of g.f. (1+x)/(1-2*x).
 * @author Sean A. Irvine
 */
public class A003945 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA.equals(Z.ONE)) {
      mA = Z.THREE;
    } else {
      mA = mA.shiftLeft(1);
    }
    return mA;
  }
}
