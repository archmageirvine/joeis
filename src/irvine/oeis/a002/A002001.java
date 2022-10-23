package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002001 a(n) = 3*4^(n-1), n&gt;0; a(0)=1.
 * @author Sean A. Irvine
 */
public class A002001 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (Z.ONE.equals(mA)) {
      mA = Z.THREE;
    } else {
      mA = mA.shiftLeft(2);
    }
    return mA;
  }
}
