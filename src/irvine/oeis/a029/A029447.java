package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029447 Numbers n that divide the (right) concatenation of all numbers &lt;= n written in base 2 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029447 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mA = mA.shiftLeft(mN.bitLength()).add(mN);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
