package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034770 Dirichlet convolution of Bell numbers with themselves.
 * @author Sean A. Irvine
 */
public class A034770 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(BellNumbers.bell(mN / d - 1).multiply(BellNumbers.bell(d - 1)));
    }
    return sum;
  }
}
