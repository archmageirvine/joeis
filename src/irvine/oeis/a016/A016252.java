package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016252 Expansion of 1/((1-x)*(1-7x)*(1-10x)).
 * @author Sean A. Irvine
 */
public class A016252 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    if (mB == null) {
      mB = Z.valueOf(18);
    } else {
      final Z t = mB.multiply(17).subtract(mA.multiply(70)).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
