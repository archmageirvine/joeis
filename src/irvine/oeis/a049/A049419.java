package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A049419 a(1) = 1; for n &gt; 1, a(n) = number of exponential divisors of n.
 * @author Sean A. Irvine
 */
public class A049419 extends Sequence1 implements DirectSequence {

  private int mN = 0;

  @Override
  public Z next() {
    return a(++mN);
  }

  @Override
  public Z a(final Z n) {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Functions.SIGMA0.z(fs.getExponent(p)));
    }
    return prod;
  }

  @Override
  public Z a(final int n) {
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(Functions.SIGMA0.z(fs.getExponent(p)));
    }
    return prod;
  }

}

