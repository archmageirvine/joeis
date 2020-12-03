package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029452 Numbers n such that n divides (right) concatenation of all numbers &lt;= n written in base 7 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029452 implements Sequence {

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
      mA = mA.multiply(mS).add(mN);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
