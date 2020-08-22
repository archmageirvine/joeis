package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016238 Expansion of 1/((1-x)*(1-5*x)*(1-11*x)).
 * @author Sean A. Irvine
 */
public class A016238 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    if (mB == null) {
      mB = Z.valueOf(17);
    } else {
      final Z t = mB.multiply(16).subtract(mA.multiply(55)).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
