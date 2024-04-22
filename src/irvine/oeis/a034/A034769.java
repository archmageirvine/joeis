package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034769 Dirichlet convolution of Catalan numbers with Bell numbers.
 * @author Sean A. Irvine
 */
public class A034769 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.CATALAN.z((long) (mN / d - 1)).multiply(BellNumbers.bell(d - 1)));
    }
    return sum;
  }
}
