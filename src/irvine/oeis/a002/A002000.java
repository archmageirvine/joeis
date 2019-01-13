package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002000.
 * @author Sean A. Irvine
 */
public class A002000 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SEVEN;
    } else {
      mA = mA.square().subtract(3).multiply(mA);
    }
    return mA;
  }
}
