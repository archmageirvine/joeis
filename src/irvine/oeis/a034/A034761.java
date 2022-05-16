package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034761 Dirichlet convolution of sigma(n) with itself.
 * @author Sean A. Irvine
 */
public class A034761 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Jaguar.factor(mN / d).sigma().multiply(Jaguar.factor(d).sigma()));
    }
    return sum;
  }
}
