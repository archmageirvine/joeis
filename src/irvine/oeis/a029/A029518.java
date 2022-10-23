package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A029518 Numbers k such that k divides the (right) concatenation of all numbers &lt;= k written in base 25 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029518 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mS = Z.valueOf(25);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mS)) {
        mS = mS.multiply(25);
      }
      mA = mA.multiply(mS).add(ZUtils.reverse(mN, 25));
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
