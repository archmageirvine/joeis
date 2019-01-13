package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016249.
 * @author Sean A. Irvine
 */
public class A016249 implements Sequence {

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
      final Z t = mB.multiply(15).subtract(mA.multiply(56)).add(1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
