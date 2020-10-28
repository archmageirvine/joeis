package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036363.
 * @author Sean A. Irvine
 */
public class A036363 implements Sequence {

  private int mN = 2;
  private Z mF = Z.THREE;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.ONE;
    }
    mF = mF.multiply(2L * mN - 3).multiply(2L * mN - 4).divide(mN - 2);
    return mF.multiply(Z.valueOf(2L * mN - 3).pow(mN - 4));
  }
}

