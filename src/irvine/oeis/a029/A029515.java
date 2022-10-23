package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A029515 Numbers k such that k divides the (right) concatenation of all numbers &lt;= k written in base 22 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029515 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mS = Z.valueOf(22);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mS)) {
        mS = mS.multiply(22);
      }
      mA = mA.multiply(mS).add(ZUtils.reverse(mN, 22));
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
