package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029467 Numbers n such that n divides the (right) concatenation of all numbers <code>&lt;= n</code> written in base <code>22</code> (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029467 implements Sequence {

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
      mA = mA.multiply(mS).add(mN);
      if (Z.ZERO.equals(mA.mod(mN))) {
        return mN;
      }
    }
  }
}
