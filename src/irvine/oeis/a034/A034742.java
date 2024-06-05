package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034742 Dirichlet convolution of Moebius function mu(n) (A008683) with Catalan numbers (A000108).
 * @author Sean A. Irvine
 */
public class A034742 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Functions.CATALAN.z(d - 1).multiply(Functions.MOBIUS.i(mN / d)));
    }
    return sum;
  }
}
