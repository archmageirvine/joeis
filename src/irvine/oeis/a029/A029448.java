package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029448 Numbers k that divide the (right) concatenation of all numbers &lt;= k written in base 3 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029448 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mS = Z.THREE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mS)) {
        mS = mS.multiply(3);
      }
      mA = mA.multiply(mS).add(mN);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
