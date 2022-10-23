package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A007727 Number of 2n-bead black-white strings with n black beads and fundamental period 2n.
 * @author Sean A. Irvine
 */
public class A007727 extends Sequence0 {

  protected long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValueExact();
      sum = sum.add(Binomial.binomial(2 * d , d).multiply(Mobius.mobius(mN / d)));
    }
    return sum;
  }
}
