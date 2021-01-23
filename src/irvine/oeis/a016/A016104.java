package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016104 2^2^2^ ... 2^w (with n 2's), where w = 1.92878.....
 * @author Sean A. Irvine
 */
public class A016104 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      mA = Z.ONE.shiftLeft(mA.intValueExact() + 1);
      while (!mA.isProbablePrime()) {
        mA = mA.subtract(1);
      }
    }
    return mA;
  }
}
