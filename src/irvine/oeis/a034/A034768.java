package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034768 Dirichlet convolution of Catalan numbers with themselves.
 * @author Sean A. Irvine
 */
public class A034768 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Binomial.catalan(mN / d - 1).multiply(Binomial.catalan(d - 1)));
    }
    return sum;
  }
}
