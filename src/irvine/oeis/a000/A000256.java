package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A000256 Number of simple triangulations of the plane with n nodes.
 * @author Sean A. Irvine
 */
public class A000256 extends Sequence3 {

  private long mN = 2;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 5) {
      return Z.ONE;
    }
    final Z n = Z.valueOf(mN);
    final Z e = n.square().multiply(8);
    final Z a = e.subtract(n.multiply(43)).add(57);
    final Z b = e.subtract(n.multiply(51)).add(81);
    mA = Binomial.binomial(3 * mN - 9, mN - 4).multiply(7)
      .subtract(mA.multiply(a))
      .shiftRight(2)
      .divide(b);
    return mA;
  }
}
