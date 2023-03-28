package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A061379 Difference between n and its reversal is a perfect cube.
 * @author Sean A. Irvine
 */
public class A061379 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.isCube(mN.subtract(ZUtils.reverse(mN)))) {
        return mN;
      }
    }
  }
}

