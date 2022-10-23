package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A056158 Equivalent of the Kurepa hypothesis for left factorial.
 * @author Sean A. Irvine
 */
public class A056158 extends Sequence3 {

  private long mN = 2;
  private Z mA = Z.valueOf(-4);

  @Override
  public Z next() {
    if (++mN > 3) {
      mA = mA.multiply(3 - mN).subtract(2 * (mN - 1));
    }
    return mA;
  }
}

