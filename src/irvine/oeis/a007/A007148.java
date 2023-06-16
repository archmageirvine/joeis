package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007148 Number of self-complementary 2-colored bracelets (turnover necklaces) with 2n beads.
 * @author Sean A. Irvine
 */
public class A007148 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      sum = sum.add(Euler.phi(dd.multiply2()).shiftLeft(mN / dd.longValue()));
    }
    sum = sum.divide(mN);
    sum = sum.add(Z.ONE.shiftLeft(mN));
    return sum.divide(4);
  }
}
