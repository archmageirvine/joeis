package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016216 Expansion of 1/((1-x)(1-3x)(1-11x)).
 * @author Sean A. Irvine
 */
public class A016216 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    if (mB == null) {
      mB = Z.valueOf(15);
    } else {
      final Z t = mB.multiply(14).subtract(mA.multiply(33)).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
