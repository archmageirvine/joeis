package irvine.oeis.a392;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068869.
 * @author Sean A. Irvine
 */
public class A392628 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Functions.VALUATION.l(fs.getExponent(p) + 1, 2) + 1);
    }
    return prod;
  }
}
