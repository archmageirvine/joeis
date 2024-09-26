package irvine.math.function;

import irvine.math.z.Z;

/**
 * Sum of the numbers less than n that do not divide n.
 * @author Sean A. Irvine
 */
public class Antisigma extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return Functions.TRIANGULAR.z(n).subtract(Functions.SIGMA1.z(n));
  }
}
