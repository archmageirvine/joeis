package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068021 Z(S_m; sigma[1](n), sigma[2](n),..., sigma[m](n)) where Z(S_m; x_1,x_2,...,x_m) is the cycle index of the symmetric group S_m and sigma[k](n) is the sum of k-th powers of divisors of n; m=4.
 * @author Sean A. Irvine
 */
public class A068021 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z s = fs.sigma();
    final Z s2 = fs.sigma2();
    return s.pow(4)
      .add(s.square().multiply(s2).multiply(6))
      .add(s.multiply(fs.sigma(3)).multiply(8))
      .add(s2.square().multiply(3))
      .add(fs.sigma(4).multiply(6))
      .divide(24);
  }
}

