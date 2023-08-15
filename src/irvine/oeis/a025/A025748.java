package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025748 3rd-order Patalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025748 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 2) {
      mA = mA.multiply(3 * mN - 4).multiply(3).divide(mN);
    }
    return mA;
  }
}
