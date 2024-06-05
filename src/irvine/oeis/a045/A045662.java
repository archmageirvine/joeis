package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A045662 Number of 2n-bead balanced binary strings of fundamental period 2n, rotationally equivalent to reverse.
 * @author Sean A. Irvine
 */
public class A045662 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      sum = sum.add(Binomial.binomial(d & ~1, d / 2).multiply(Functions.MOBIUS.i(mN / d)));
    }
    return sum.multiply(2L * mN);
  }
}

