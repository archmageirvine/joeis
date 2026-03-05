package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393527 a(0) = a(1) = a(2) = 1; thereafter odd indexed terms are the sum of the last 3 terms and even indexed terms are the sum of all previous terms.
 * @author Sean A. Irvine
 */
public class A393527 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private Z mC = null;
  private Z mSum = Z.THREE;
  private boolean mOdd = false;

  @Override
  public Z next() {
    if (mC == null) {
      if (mB == null) {
        if (mA == null) {
          mA = Z.ONE;
          return Z.ONE;
        }
        mB = Z.ONE;
        return Z.ONE;
      }
      mC = Z.ONE;
      return Z.ONE;
    }
    mOdd = !mOdd;
    final Z t = mOdd ? mA.add(mB).add(mC) : mSum;
    mA = mB;
    mB = mC;
    mC = t;
    mSum = mSum.add(t);
    return t;
  }
}
