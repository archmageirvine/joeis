package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000317.
 * @author Sean A. Irvine
 */
public class A000317 implements Sequence {

  private Z mA = null;
  private Z mB = null;

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
    final Z t = mB.square()
      .subtract(mA.multiply(mB))
      .add(mA.square());
    mA = mB;
    mB = t;
    return t;
  }
}
