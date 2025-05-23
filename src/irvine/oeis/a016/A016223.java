package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016223 Expansion of 1/((1-x) * (1-4*x) * (1-7*x)).
 * @author Sean A. Irvine
 */
public class A016223 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    if (mB == null) {
      mB = Z.valueOf(12);
    } else {
      final Z t = mB.multiply(11).subtract(mA.multiply(28)).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
