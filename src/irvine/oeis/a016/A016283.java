package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016283.
 * @author Sean A. Irvine
 */
public class A016283 implements Sequence {

  private Z mA = null;
  private Z mB = Z.TWO;
  private Z mC = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = mA.multiply(6);
      mB = mB.shiftLeft(2);
      mC = mC.multiply2();
    }
    return mA.add(mC).subtract(mB).shiftRight(3);
  }
}
