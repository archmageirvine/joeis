package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034771 Dirichlet convolution of d(n) (# of divisors) with b_n=2^(n-1).
 * @author Sean A. Irvine
 */
public class A034771 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Jaguar.factor(mN / d).sigma0().shiftLeft(d - 1));
    }
    return sum;
  }
}
