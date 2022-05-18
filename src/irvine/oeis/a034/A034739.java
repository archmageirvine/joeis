package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034739 Dirichlet convolution of b_n=2^(n-1) with Catalan numbers.
 * @author Sean A. Irvine
 */
public class A034739 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Binomial.catalan(mN / d - 1).shiftLeft(d - 1));
    }
    return sum;
  }
}
