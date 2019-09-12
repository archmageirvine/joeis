package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025749 4th order Patalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025749 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 2) {
      mA = mA.multiply(4 * mN - 5).multiply(4).divide(mN);
    }
    return mA;
  }
}
