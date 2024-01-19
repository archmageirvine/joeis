package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068024 Z(S_m; sigma[1](n), sigma[2](n),..., sigma[m](n)) where Z(S_m; x_1,x_2,...,x_m) is the cycle index of the symmetric group S_m and sigma[k](n) is the sum of k-th powers of divisors of n; m=7.
 * @author Sean A. Irvine
 */
public class A068024 extends Sequence1 {

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
    return s1.pow(7)
      .add(s1.pow(5).multiply(s2).multiply(21))
      .add(s1.pow(4).multiply(s3).multiply(70))
      .add(s1.pow(3).multiply(s2.square()).multiply(105))
      .add(s1.pow(3).multiply(s4).multiply(210))
      .add(s1.square().multiply(s2).multiply(s3).multiply(420))
      .add(s1.multiply(s2.pow(3)).multiply(105))
      .add(s1.square().multiply(s5).multiply(504))
      .add(s1.multiply(s2).multiply(s4).multiply(630))
      .add(s1.multiply(s3.square()).multiply(280))
      .add(s2.square().multiply(s3).multiply(210))
      .add(s1.multiply(s6).multiply(840))
      .add(s2.multiply(s5).multiply(504))
      .add(s3.multiply(s4).multiply(420))
      .add(s7.multiply(720))
      .divide(5040);
  }
}

