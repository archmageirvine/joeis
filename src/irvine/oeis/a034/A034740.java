package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034740 Dirichlet convolution of b_n=2^(n-1) with Bell numbers.
 * @author Sean A. Irvine
 */
public class A034740 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(BellNumbers.bell(mN / d - 1).shiftLeft(d - 1));
    }
    return sum;
  }
}
