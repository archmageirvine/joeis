package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A011780.
 * @author Sean A. Irvine
 */
public class A011780 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(96).add(32).multiply(mN).add(320).shiftLeft(mN)
      .signedAdd((mN & 1) == 0, n.add(4))
      .subtract(n.multiply(27))
      .subtract(216)
      .divide(108);
  }
}
