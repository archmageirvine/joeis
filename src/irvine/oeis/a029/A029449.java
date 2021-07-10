package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A029449 Numbers k that divide the (right) concatenation of all numbers &lt;= k written in base 4 (most significant digit on left).
 * @author Sean A. Irvine
 */
public class A029449 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mA = mA.shiftLeft((mN.bitLength() + 1) & ~1).add(mN);
      if (mA.mod(mN).isZero()) {
        return mN;
      }
    }
  }
}
