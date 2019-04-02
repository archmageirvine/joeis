package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002531 Numerators of continued fraction convergents to sqrt(3).
 * @author Sean A. Irvine
 */
public class A002531 implements Sequence {

  private boolean mOdd = true;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    mOdd = !mOdd;
    if (mA == null) {
      if (mB == null) {
        mB = Z.ONE;
      } else {
        mA = Z.ONE;
      }
    } else {
      final Z t = mA.add(mOdd ? mB.multiply2() : mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
