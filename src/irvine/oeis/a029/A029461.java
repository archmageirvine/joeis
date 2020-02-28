package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029461 Numbers n such that n divides the (right) concatenation of all numbers <code>&lt;= n</code> written in base <code>16</code> (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029461 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mA = mA.shiftLeft((mN.bitLength() + 3) & ~3).add(mN);
      if (Z.ZERO.equals(mA.mod(mN))) {
        return mN;
      }
    }
  }
}
