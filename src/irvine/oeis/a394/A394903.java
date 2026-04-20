package irvine.oeis.a394;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A394903 Number of square grid edges that are visible through the n-th order Sierpinski carpet fractal.
 * @author Sean A. Irvine
 */
public class A394903 extends Sequence0 {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(8).add(Z.THREE.pow(2 * (mN - 1)).subtract(Z.THREE.pow(mN - 1)).multiply2());
    }
    return mA;
  }
}
