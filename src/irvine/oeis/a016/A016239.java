package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016239 Expansion of 1/((1-x)*(1-5*x)*(1-12*x)).
 * @author Sean A. Irvine
 */
public class A016239 implements Sequence {

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
      final Z t = mB.multiply(17).subtract(mA.multiply(60)).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
