package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015460.
 * @author Sean A. Irvine
 */
public class A015460 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mT = null;

  protected int q() {
    return 3;
  }

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ZERO;
        return Z.ZERO;
      }
      mB = Z.ONE;
      return Z.ONE;
    }
    mT = mT == null ? Z.ONE : mT.multiply(q());
    final Z t = mA.multiply(mT).add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
