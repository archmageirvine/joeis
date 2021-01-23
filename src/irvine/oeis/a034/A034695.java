package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034695 Tau_6 (the 6th Piltz divisor function), the number of ordered 6-factorizations of n; Dirichlet convolution of number-of-divisors function (A000005) with A007426.
 * @author Sean A. Irvine
 */
public class A034695 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      prod = prod.multiply(Binomial.binomial(e + 5, e));
    }
    return prod;
  }
}

