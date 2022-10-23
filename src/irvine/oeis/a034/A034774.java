package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034774 Dirichlet convolution of d(n) (# of divisors) with Catalan numbers.
 * @author Sean A. Irvine
 */
public class A034774 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Jaguar.factor(mN / d).sigma0().multiply(Binomial.catalan(d - 1)));
    }
    return sum;
  }
}
