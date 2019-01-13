package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001601.
 * @author Sean A. Irvine
 */
public class A001601 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (mA == Z.ONE) {
      mA = Z.THREE;
    } else {
      mA = mA.square().multiply2().subtract(1);
    }
    return mA;
  }
}
