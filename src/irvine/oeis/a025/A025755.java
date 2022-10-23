package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A025755 10th-order Patalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025755 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 2) {
      mA = mA.multiply(10 * mN - 11).multiply(10).divide(mN);
    }
    return mA;
  }
}
