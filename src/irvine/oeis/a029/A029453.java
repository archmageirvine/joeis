package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029453 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 8 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029453 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mA = mA.shiftLeft(3 * ((mN.bitLength() + 2) / 3)).add(mN);
      if (Z.ZERO.equals(mA.mod(mN))) {
        return mN;
      }
    }
  }
}
