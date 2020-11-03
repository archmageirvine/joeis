package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036449 Values square, differences triangular.
 * @author Sean A. Irvine
 */
public class A036449 implements Sequence {

  private Z mA = null;

  private boolean isTriangular(final Z n) {
    return n.shiftLeft(3).add(1).isSquare();
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
    } else {
      Z b = mA.sqrt();
      do {
        b = b.add(1);
      } while (!isTriangular(b.square().subtract(mA)));
      mA = b.square();
    }
    return mA;
  }
}
