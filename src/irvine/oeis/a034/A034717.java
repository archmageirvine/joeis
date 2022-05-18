package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034717 Dirichlet convolution of Catalan numbers (1,2,5,14...) with themselves.
 * @author Sean A. Irvine
 */
public class A034717 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Binomial.catalan(d).multiply(Binomial.catalan(mN / d)));
    }
    return sum;
  }
}
