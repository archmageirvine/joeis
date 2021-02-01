package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025754 9th-order Patalan numbers (generalization of Catalan numbers).
 * @author Sean A. Irvine
 */
public class A025754 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN >= 2) {
      mA = mA.multiply(9 * mN - 10).multiply(9).divide(mN);
    }
    return mA;
  }
}
