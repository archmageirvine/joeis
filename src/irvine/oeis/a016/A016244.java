package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016244 Expansion of 1/((1-x)*(1-6*x)*(1-9*x)).
 * @author Sean A. Irvine
 */
public class A016244 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return mA;
    }
    if (mB == null) {
      mB = Z.valueOf(16);
    } else {
      final Z t = mB.multiply(15).subtract(mA.multiply(54)).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
