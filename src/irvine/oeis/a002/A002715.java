package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002715 An infinite coprime sequence defined by recursion.
 * @author Sean A. Irvine
 */
public class A002715 extends Sequence0 {

  private Z mP = null;
  private boolean mEven = true;

  @Override
  public Z next() {
    if (mP == null) {
      mP = Z.THREE;
    } else {
      mEven = !mEven;
      if (mEven) {
        mP = mP.square().subtract(3).divide2();
      } else {
        mP = mP.multiply2().add(1);
      }
    }
    return mP;
  }
}

