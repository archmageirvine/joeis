package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010035.
 * @author Sean A. Irvine
 */
public class A010035 implements Sequence {

  private Z mA = null;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
    } else {
      mA = mA.multiply(9);
      mB = mB.multiply(3);
    }
    return mA.subtract(mB);
  }
}
