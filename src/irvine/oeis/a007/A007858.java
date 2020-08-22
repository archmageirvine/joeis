package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007858 G.f. is 1 - 1/f(x), where f(x) = 1+x+3*x^2+9*x^3+32*x^4+... is 1/x times g.f. for A063020.
 * @author Sean A. Irvine
 */
public class A007858 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (++mN < 3) {
      return mN == 1 ? mA : mB;
    }
    final Z n = Z.valueOf(mN);
    final Z t = mA.multiply(n.multiply(17).subtract(47).multiply(mN).add(32)).multiply(4 * mN - 9).multiply(4 * mN - 11).multiply(2 * mN - 5).multiply(8)
      .add(mB.multiply(n.multiply(1819).subtract(14124).multiply(mN).add(40377).multiply(mN).subtract(50320).multiply(mN).add(23040)).multiply(mN - 1))
      .divide(n.multiply(17).subtract(81).multiply(mN).add(96))
      .divide(2 * mN - 3)
      .divide(mN)
      .divide(mN - 1)
      .divide(16);
    mA = mB;
    mB = t;
    return mB;
  }
}
