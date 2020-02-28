package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029485 Numbers n such that n divides the (left) concatenation of all numbers <code>&lt;= n</code> written in base <code>16</code> (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029485 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      while (mT.compareTo(mA) <= 0) {
        mT = mT.shiftLeft(4);
      }
      mN = mN.add(1);
      mA = mN.multiply(mT).add(mA);
      if (Z.ZERO.equals(mA.mod(mN))) {
        return mN;
      }
    }
  }
}
