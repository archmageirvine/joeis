package irvine.oeis.a029;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029538 Numbers n such that n divides the (left) concatenation of all numbers &lt;= n written in base 21 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029538 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      while (mT.compareTo(mA) <= 0) {
        mT = mT.multiply(21);
      }
      mN = mN.add(1);
      mA = Functions.REVERSE.z(21, mN).multiply(mT).add(mA);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
