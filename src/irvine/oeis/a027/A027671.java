package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027671 Number of necklaces with n beads of 3 colors, allowing turning over.
 * @author Sean A. Irvine
 */
public class A027671 implements Sequence {

  private int mN = -1;

  protected int colors() {
    return 3;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Z c = Z.valueOf(colors());
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(c.pow(mN / d).multiply(Euler.phi(dd)));
    }
    return sum.divide(mN).multiply2().add(c.pow((mN + 1) / 2).add(c.pow((mN + 2) / 2))).divide(4);
  }
}
