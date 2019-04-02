package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002716 An infinite coprime sequence defined by recursion.
 * @author Sean A. Irvine
 */
public class A002716 implements Sequence {

  private Z mQ = null;
  private Z mP = null;
  private boolean mEven = false;

  @Override
  public Z next() {
    if (mP == null) {
      if (mQ == null) {
        mQ = Z.THREE;
        return mQ;
      }
      mP = Z.FIVE;
    } else {
      final Z t;
      mEven = !mEven;
      if (mEven) {
        t = mP.square().subtract(mP.multiply(3)).add(3);
      } else {
        t = mP.add(mQ).subtract(1);
      }
      mQ = mP;
      mP = t;
    }
    return mP;
  }
}

