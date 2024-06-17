package irvine.oeis.a028;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028928 Theta series of quadratic form (or lattice) with Gram matrix [ 3, 1; 1, 5 ].
 * @author Sean A. Irvine
 */
public class A028928 extends Sequence0 {

  // After Michael Somos

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long t = mN;
    while (t % 7 == 0) {
      t /= 7;
    }
    final int kronecker = Functions.KRONECKER.i(-7, t);
    if (kronecker != -1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      sum = sum.add(Functions.KRONECKER.i(-14, dd));
    }
    return sum;
  }
}

