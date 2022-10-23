package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034737 Dirichlet convolution of b_n=2^(n-1) with sigma(n).
 * @author Sean A. Irvine
 */
public class A034737 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Jaguar.factor(mN / d).sigma().shiftLeft(d - 1));
    }
    return sum;
  }
}
