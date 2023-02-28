package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061695 Generalized Bell numbers.
 * @author Sean A. Irvine
 */
public class A061695 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(mN + 1).multiply(mN + 1);
    }
    return mF.multiply(mN + 1).multiply(mN).divide(8);
  }
}

