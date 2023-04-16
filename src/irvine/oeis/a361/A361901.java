package irvine.oeis.a361;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A361901 allocated for Jos\u00e9 E. Solsona.
 * @author Sean A. Irvine
 */
public class A361901 extends Sequence0 {

  private static final Z Z20 = Z.valueOf(20);
  private Z mF = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mF = mF.multiply(5 * mN).multiply(5 * mN - 1).multiply(5 * mN - 2).multiply(5 * mN - 3).multiply(5 * mN - 4);
    }
    return mF.divide(Z20.pow(mN));
  }
}

