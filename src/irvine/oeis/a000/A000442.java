package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000442 a(n) = (n!)^3.
 * @author Sean A. Irvine
 */
public class A000442 extends Sequence0 {

  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN);
    }
    return mF.pow(3);
  }
}
