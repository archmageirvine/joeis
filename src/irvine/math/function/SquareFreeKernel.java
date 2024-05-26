package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Square free kernel function.
 * @author Sean A. Irvine
 */
class SquareFreeKernel extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return Jaguar.factor(n).squareFreeKernel();
  }
}
