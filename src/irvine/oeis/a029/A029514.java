package irvine.oeis.a029;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029514 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 21 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029514 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mS = Z.valueOf(21);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.equals(mS)) {
        mS = mS.multiply(21);
      }
      mA = mA.multiply(mS).add(Functions.REVERSE.z(21, mN));
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
