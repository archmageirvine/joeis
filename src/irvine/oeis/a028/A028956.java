package irvine.oeis.a028;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028956 Theta series of quadratic form (or lattice) with Gram matrix [ 4, 1; 1, 4 ].
 * @author Sean A. Irvine
 */
public class A028956 extends Sequence0 {

  // After Michael Somos

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final long d = dd.longValue();
      sum = sum.add(Functions.KRONECKER.i(-15, d) - (long) Functions.KRONECKER.i(-3, d) * Functions.KRONECKER.i(5, mN / d));
    }
    return sum;
  }
}
