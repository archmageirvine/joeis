package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025751 6th order Patalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025751 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 2) {
      mA = mA.multiply(6 * mN - 7).multiply(6).divide(mN);
    }
    return mA;
  }
}
