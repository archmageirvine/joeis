package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034732 Dirichlet convolution of b_n=1 with Bell numbers.
 * @author Sean A. Irvine
 */
public class A034732 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      sum = sum.add(BellNumbers.bell(dd.intValue() - 1));
    }
    return sum;
  }
}
