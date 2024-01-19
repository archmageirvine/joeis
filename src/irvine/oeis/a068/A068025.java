package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068025 Z(S_m; sigma[1](n), sigma[2](n),..., sigma[m](n)) where Z(S_m; x_1,x_2,...,x_m) is the cycle index of the symmetric group S_m and sigma[k](n) is the sum of k-th powers of divisors of n; m=8.
 * @author Sean A. Irvine
 */
public class A068025 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z s1 = fs.sigma();
    final Z s2 = fs.sigma2();
    final Z s3 = fs.sigma(3);
    final Z s4 = fs.sigma(4);
    final Z s5 = fs.sigma(5);
    final Z s6 = fs.sigma(6);
    final Z s7 = fs.sigma(7);
    final Z s8 = fs.sigma(8);
    return s1.pow(8)
      .add(s1.pow(6).multiply(s2).multiply(28))
      .add(s1.pow(5).multiply(s3).multiply(112))
      .add(s1.pow(4).multiply(s2.square()).multiply(210))
      .add(s1.pow(4).multiply(s4).multiply(420))
      .add(s1.pow(3).multiply(s2).multiply(s3).multiply(1120))
      .add(s1.square().multiply(s2.pow(3)).multiply(420))
      .add(s1.pow(3).multiply(s5).multiply(1344))
      .add(s1.square().multiply(s2).multiply(s4).multiply(2520))
      .add(s1.square().multiply(s3.square()).multiply(1120))
      .add(s1.multiply(s2.square()).multiply(s3).multiply(1680))
      .add(s2.pow(4).multiply(105))
      .add(s1.square().multiply(s6).multiply(3360))
      .add(s1.multiply(s2).multiply(s5).multiply(4032))
      .add(s1.multiply(s3).multiply(s4).multiply(3360))
      .add(s2.square().multiply(s4).multiply(1260))
      .add(s2.multiply(s3.square()).multiply(1120))
      .add(s7.multiply(s1).multiply(5760))
      .add(s2.multiply(s6).multiply(3360))
      .add(s3.multiply(s5).multiply(2688))
      .add(s4.square().multiply(1260))
      .add(s8.multiply(5040))
      .divide(40320);
  }
}

