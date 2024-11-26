package irvine.oeis.a370;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A370239 The sum of divisors of n that are squares of squarefree numbers.
 * @author Sean A. Irvine
 */
public class A370239 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final DirichletSeries z = DirichletSeries.zeta(++mN);
    final DirichletSeries t = z.reciprocal().shift(4).substitute(4, mN);
    return z.multiply(z.shift(2).substitute(2, mN), mN).multiply(t, mN).coeff(mN);
  }
}

