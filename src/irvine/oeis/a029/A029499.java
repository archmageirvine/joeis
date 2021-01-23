package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A029499 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 6 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029499 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mS = Z.SIX;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mS)) {
        mS = mS.multiply(6);
      }
      mA = mA.multiply(mS).add(ZUtils.reverse(mN, 6));
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
