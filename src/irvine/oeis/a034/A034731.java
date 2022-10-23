package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034731 Dirichlet convolution of b_n=1 with Catalan numbers.
 * @author Sean A. Irvine
 */
public class A034731 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(Binomial.catalan(dd.intValue() - 1));
    }
    return sum;
  }
}
