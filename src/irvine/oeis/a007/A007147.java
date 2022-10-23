package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007147 Number of self-dual 2-colored necklaces with 2n beads.
 * @author Sean A. Irvine
 */
public class A007147 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      if (dd.isOdd()) {
        sum = sum.add(Euler.phi(dd).shiftLeft(mN / dd.intValue()));
      }
    }
    sum = sum.divide(mN);
    sum = sum.add(Z.ONE.shiftLeft(1 + (mN - 1) / 2));
    return sum.divide(4);
  }
}
