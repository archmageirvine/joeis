package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068022 Z(S_m; sigma[1](n), sigma[2](n),..., sigma[m](n)) where Z(S_m; x_1,x_2,...,x_m) is the cycle index of the symmetric group S_m and sigma[k](n) is the sum of k-th powers of divisors of n; m=5.
 * @author Sean A. Irvine
 */
public class A068022 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z s = fs.sigma();
    final Z s2 = fs.sigma2();
    final Z s3 = fs.sigma(3);
    return s.pow(5)
      .add(s.pow(3).multiply(s2).multiply(10))
      .add(s.square().multiply(s3).multiply(20))
      .add(s.multiply(s2.square()).multiply(15))
      .add(s.multiply(fs.sigma(4)).multiply(30))
      .add(s2.multiply(s3).multiply(20))
      .add(fs.sigma(5).multiply(24))
      .divide(120);
  }
}

