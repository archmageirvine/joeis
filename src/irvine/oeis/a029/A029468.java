package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029468 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 23 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029468 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mS = Z.valueOf(23);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mS)) {
        mS = mS.multiply(23);
      }
      mA = mA.multiply(mS).add(mN);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
