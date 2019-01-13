package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001045.
 * @author Sean A. Irvine
 */
public class A001045 implements Sequence {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    if (mB == null) {
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = mB.add(mA.multiply2());
    mA = mB;
    mB = t;
    return t;
  }
}
