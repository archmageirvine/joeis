package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A039941 Alternately add and multiply.
 * @author Sean A. Irvine
 */
public class A039941 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private boolean mAdd = false;

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
    mAdd = !mAdd;
    final Z t = mAdd ? mA.add(mB) : mA.multiply(mB);
    mA = mB;
    mB = t;
    return t;
  }
}
