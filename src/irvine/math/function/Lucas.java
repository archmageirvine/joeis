package irvine.math.function;

import irvine.math.z.Z;

/**
 * Lucas function.
 * @author Sean A. Irvine
 */
class Lucas extends AbstractFunction1 {

  @Override
  public Z z(final long n) {
    return Functions.FIBONACCI.z(n - 1).add(Functions.FIBONACCI.z(n + 1));
  }
}
