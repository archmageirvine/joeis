package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029484 Numbers k that divide the (left) concatenation of all numbers &lt;= k written in base 15 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029484 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      while (mT.compareTo(mA) <= 0) {
        mT = mT.multiply(15);
      }
      mN = mN.add(1);
      mA = mN.multiply(mT).add(mA);
      if (mN.mod(3) != 0 && mN.mod(5) != 0 && mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
