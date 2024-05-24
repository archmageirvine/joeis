package irvine.oeis.a023;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A023900 Dirichlet inverse of Euler totient function (A000010).
 * @author Sean A. Irvine
 */
public class A023900 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(n).divisors()) {
      sum = sum.add(d.multiply(Functions.MOBIUS.i(d.longValue())));
    }
    return sum;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

}

