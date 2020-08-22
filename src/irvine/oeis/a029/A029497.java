package irvine.oeis.a029;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A029497 Numbers n such that n divides the (right) concatenation of all numbers &lt;= n written in base 4 (most significant digit on right).
 * @author Sean A. Irvine
 */
public class A029497 implements Sequence {

  private Z mN = Z.ZERO;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      mA = mA.shiftLeft((mN.bitLength() + 1) & ~1).add(ZUtils.reverse(mN, 4));
      if (Z.ZERO.equals(mA.mod(mN))) {
        return mN;
      }
    }
  }
}
