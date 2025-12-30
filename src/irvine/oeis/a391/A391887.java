package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391887 allocated for Adolf Cusmariu.
 * @author Sean A. Irvine
 */
public class A391887 extends Sequence0 {

  private Z mA = null;
  private Z mB = null;
  private boolean mAdd = false;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.TWO;
        return Z.TWO;
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
