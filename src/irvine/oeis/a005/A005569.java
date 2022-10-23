package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005569 Number of walks on square lattice.
 * @author Sean A. Irvine
 */
public class A005569 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.FOUR;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(mN).multiply(2 * mN - 1).multiply(2 * mN + 1).multiply(5 * mN + 7).multiply(4)
        .divide(mN - 1).divide(mN + 2).divide(mN + 3).divide(5 * mN + 2);
    }
    return mA;
  }
}

