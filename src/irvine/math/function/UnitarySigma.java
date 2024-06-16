package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Unitary sigma.
 * @author Sean A. Irvine
 */
class UnitarySigma extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return Jaguar.factor(n).unitarySigma();
  }
}
