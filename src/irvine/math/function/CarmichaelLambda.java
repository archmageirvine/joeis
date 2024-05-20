package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Carmichael lambda function.
 * @author Sean A. Irvine
 */
class CarmichaelLambda extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    Z lambda = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (Z.TWO.equals(p)) {
        if (e > 2) {
          lambda = lambda.lcm(Z.ONE.shiftLeft(e - 2));
        } else if (e == 2) {
          lambda = lambda.lcm(Z.TWO);
        }
      } else {
        lambda = lambda.lcm(p.subtract(1).multiply(p.pow(e - 1)));
      }
    }
    return lambda;
  }
}
