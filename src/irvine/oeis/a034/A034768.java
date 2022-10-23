package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034768 Dirichlet convolution of Catalan numbers with themselves.
 * @author Sean A. Irvine
 */
public class A034768 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Binomial.catalan(mN / d - 1).multiply(Binomial.catalan(d - 1)));
    }
    return sum;
  }
}
