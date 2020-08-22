package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015459 q-Fibonacci numbers for q=2.
 * @author Sean A. Irvine
 */
public class A015459 implements Sequence {

  private Z mA = null;
  private Z mB = null;
  private int mN = -1;

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
    final Z t = mA.shiftLeft(++mN).add(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
