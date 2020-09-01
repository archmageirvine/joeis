package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034767 Dirichlet convolution of phi(n) with Bell numbers.
 * @author Sean A. Irvine
 */
public class A034767 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Cheetah.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Cheetah.factor(mN / d).phi().multiply(BellNumbers.bell(d - 1)));
    }
    return sum;
  }
}
