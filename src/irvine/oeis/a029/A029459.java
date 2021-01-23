package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029459 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 14 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029459 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mS = Z.valueOf(14);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mS)) {
        mS = mS.multiply(14);
      }
      mA = mA.multiply(mS).add(mN);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
