package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392629 The number of coreful infinitary divisors of n that are numbers whose number of divisors is a power of 2.
 * @author Sean A. Irvine
 */
public class A392629 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Functions.VALUATION.l(fs.getExponent(p) + 1, 2));
    }
    return prod;
  }
}
