package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A008839 Numbers k such that the decimal expansion of 5^k contains no zeros.
 * @author Sean A. Irvine
 */
public class A008839 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.multiply(5);
      }
      if (!ZUtils.containsZero(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}


