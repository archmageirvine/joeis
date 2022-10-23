package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029453 Numbers k that divide the (right) concatenation of all numbers &lt;= k written in base 8 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029453 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mA = mA.shiftLeft(3 * ((mN.bitLength() + 2) / 3)).add(mN);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
