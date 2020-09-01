package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034774 Dirichlet convolution of d(n) (# of divisors) with Catalan numbers.
 * @author Sean A. Irvine
 */
public class A034774 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Cheetah.factor(mN / d).sigma0().multiply(Binomial.catalan(d - 1)));
    }
    return sum;
  }
}
