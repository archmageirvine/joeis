package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002001.
 * @author Sean A. Irvine
 */
public class A002001 implements Sequence {

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
