package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029471 Numbers n such that n divides the (left) concatenation of all numbers &lt;= n written in base 2 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029471 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mA = mN.shiftLeft(mA.bitLength()).add(mA);
      if (Z.ZERO.equals(mA.mod(mN))) {
        return mN;
      }
    }
  }
}
