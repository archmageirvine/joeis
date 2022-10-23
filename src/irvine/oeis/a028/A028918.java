package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A028918 (3n+1)!/(4*(3n-1)).
 * @author Sean A. Irvine
 */
public class A028918 extends Sequence1 {

  private Z mA = Z.THREE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.multiply(3 * mN).multiply(3 * mN - 4).multiply(3 * mN + 1);
    }
    return mA;
  }
}
