package irvine.oeis.a370;

import irvine.math.z.DirichletSeries;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A370239 The sum of divisors of n that are squares of squarefree numbers.
 * @author Sean A. Irvine
 */
public class A370239 extends Sequence1 {

  // todo this is currently failing at term 31
  // todo potential int overflow somewhere in the division -> inverse

  private static final int EXTRA = 100; // I don't think this is the problem, ideally this should be 0
  private int mN = 0;

  @Override
  public Z next() {
    final DirichletSeries z = DirichletSeries.zeta(++mN + EXTRA);
    return z.multiply(z.shift(2).substitute(2, mN + EXTRA), mN + EXTRA).divide(z.shift(4).substitute(4, mN + EXTRA), mN + EXTRA).coeff(mN);
  }
}

