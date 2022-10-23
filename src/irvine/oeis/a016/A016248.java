package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016248 Expansion of 1/((1-x)(1-6x)(1-12x)).
 * @author Sean A. Irvine
 */
public class A016248 extends Sequence0 {

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
      final Z t = mB.multiply(18).subtract(mA.multiply(72)).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
