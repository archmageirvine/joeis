package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A029500 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 7 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029500 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mS = Z.SEVEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mS)) {
        mS = mS.multiply(7);
      }
      mA = mA.multiply(mS).add(ZUtils.reverse(mN, 7));
      if (Z.ZERO.equals(mA.mod(mN))) {
        return mN;
      }
    }
  }
}
