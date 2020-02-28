package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A029506 Numbers n such that n divides the (right) concatenation of all numbers <code>&lt;= n</code> written in base <code>13</code> (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029506 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mS = Z.valueOf(13);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mS)) {
        mS = mS.multiply(13);
      }
      mA = mA.multiply(mS).add(ZUtils.reverse(mN, 13));
      if (Z.ZERO.equals(mA.mod(mN))) {
        return mN;
      }
    }
  }
}
