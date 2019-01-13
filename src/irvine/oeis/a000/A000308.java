package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000308.
 * @author Sean A. Irvine
 */
public class A000308 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    if (mB == null) {
      mB = Z.TWO;
      return Z.TWO;
    }
    if (mC == null) {
      mC = Z.THREE;
      return Z.THREE;
    }
    final Z t = mA.multiply(mB).multiply(mC);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

