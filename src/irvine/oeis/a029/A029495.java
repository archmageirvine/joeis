package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A029495 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 2 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029495 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mA = mA.shiftLeft(mN.bitLength()).add(ZUtils.reverse(mN, 2));
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
