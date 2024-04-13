package irvine.oeis.a029;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029513 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 20 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029513 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mS = Z.valueOf(20);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mS)) {
        mS = mS.multiply(20);
      }
      mA = mA.multiply(mS).add(Functions.REVERSE.z(20, mN));
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
