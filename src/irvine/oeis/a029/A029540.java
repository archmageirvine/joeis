package irvine.oeis.a029;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A029540 Numbers n such that n divides the (left) concatenation of all numbers &lt;= n written in base 23 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029540 extends Sequence1 {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      while (mT.compareTo(mA) <= 0) {
        mT = mT.multiply(23);
      }
      mN = mN.add(1);
      mA = Functions.REVERSE.z(23, mN).multiply(mT).add(mA);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
