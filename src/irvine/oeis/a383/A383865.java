package irvine.oeis.a383;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A383865 The number of divisors d of n having the property that for every prime p dividing n the p-adic valuation of d is either 0 or an infinitary divisor of the p-adic valuation of n.
 * @author Sean A. Irvine
 */
public class A383865 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Functions.INFINITARY_SIGMA0.z(fs.getExponent(p)).add(1));
    }
    return prod;
  }
}

