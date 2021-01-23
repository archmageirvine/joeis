package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029463 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 18 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029463 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mS = Z.valueOf(18);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mS)) {
        mS = mS.multiply(18);
      }
      mA = mA.multiply(mS).add(mN);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
