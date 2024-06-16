package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Unitary sigma0.
 * @author Sean A. Irvine
 */
class UnitarySigma0 extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return Jaguar.factor(n).unitarySigma0();
  }
}
