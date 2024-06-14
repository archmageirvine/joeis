package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Expand the number into a primorial base log representation.
 * @author Georg Fischer
 */
class PrimorialBaseLog extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    if (n.equals(Z.ONE)) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      final int iz = Functions.PRIME_PI.i(p);
      sum = sum.add(Functions.PRIMORIAL_COUNT.z(iz - 1).multiply(fs.getExponent(p)));
    }
    return sum;
  }
}
