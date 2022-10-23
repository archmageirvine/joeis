package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034765 Dirichlet convolution of sigma(n) with Bell numbers.
 * @author Sean A. Irvine
 */
public class A034765 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Jaguar.factor(mN / d).sigma().multiply(BellNumbers.bell(d - 1)));
    }
    return sum;
  }
}
