package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A029518 Numbers n such that n divides the (right) concatenation of all numbers <code>&lt;= n</code> written in base <code>25</code> (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029518 implements Sequence {

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
      if (Z.ZERO.equals(mA.mod(mN))) {
        return mN;
      }
    }
  }
}
