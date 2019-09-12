package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025752 7th order Patalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025752 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 2) {
      mA = mA.multiply(7 * mN - 8).multiply(7).divide(mN);
    }
    return mA;
  }
}
