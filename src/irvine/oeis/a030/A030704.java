package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A030704 Numbers k such that the decimal expansion of 8^k contains no zeros (probably finite).
 * @author Sean A. Irvine
 */
public class A030704 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (++mN > 0) {
        mA = mA.shiftLeft(3);
      }
      if (!ZUtils.containsZero(mA)) {
        return Z.valueOf(mN);
      }
    }
  }
}


