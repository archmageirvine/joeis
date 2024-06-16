package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Arithmetic derivative function.
 * @author Sean A. Irvine
 */
class ArithmeticDerivative extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return Jaguar.factor(n).arithmeticDerivative();
  }
}
