package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A036449 Values square, differences triangular.
 * @author Sean A. Irvine
 */
public class A036449 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      Z b = mA.sqrt();
      do {
        b = b.add(1);
      } while (!ZUtils.isTriangular(b.square().subtract(mA)));
      mA = b.square();
    }
    return mA;
  }
}
