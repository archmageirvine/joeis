package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029471 Numbers k that divide the (left) concatenation of all numbers &lt;= k written in base 2 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029471 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mA = mN.shiftLeft(mA.bitLength()).add(mA);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
