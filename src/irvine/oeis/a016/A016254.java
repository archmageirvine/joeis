package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016254.
 * @author Sean A. Irvine
 */
public class A016254 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    if (mB == null) {
      mB = Z.valueOf(19);
    } else {
      final Z t = mB.multiply(18).subtract(mA.multiply(77)).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
