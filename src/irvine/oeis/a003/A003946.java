package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003946.
 * @author Sean A. Irvine
 */
public class A003946 implements Sequence {

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
