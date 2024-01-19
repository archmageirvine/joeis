package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068023 Z(S_m; sigma[1](n), sigma[2](n),..., sigma[m](n)) where Z(S_m; x_1,x_2,...,x_m) is the cycle index of the symmetric group S_m and sigma[k](n) is the sum of k-th powers of divisors of n; m=6.
 * @author Sean A. Irvine
 */
public class A068023 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z s = fs.sigma();
    final Z s2 = fs.sigma2();
    final Z s3 = fs.sigma(3);
    final Z s4 = fs.sigma(4);
    return s.pow(6)
      .add(s.pow(4).multiply(s2).multiply(15))
      .add(s.pow(3).multiply(s3).multiply(40))
      .add(s.square().multiply(s2.square()).multiply(45))
      .add(s.square().multiply(s4).multiply(90))
      .add(s.multiply(s2).multiply(s3).multiply(120))
      .add(s2.pow(3).multiply(15))
      .add(s.multiply(fs.sigma(5)).multiply(144))
      .add(s2.multiply(s4).multiply(90))
      .add(s3.square().multiply(40))
      .add(fs.sigma(6).multiply(120))
      .divide(720);
  }
}
