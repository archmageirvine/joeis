package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015474 q-Fibonacci numbers for q=3.
 * @author Sean A. Irvine
 */
public class A015474 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private Z mT = Z.ONE;

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
    mT = mT.multiply(q());
    final Z t = mB.multiply(mT).add(mA);
    mA = mB;
    mB = t;
    return t;
  }
}
