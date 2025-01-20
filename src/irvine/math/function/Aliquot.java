package irvine.math.function;

import irvine.math.z.Z;

/**
 * Compute the sum of aliquot divisors function.
 * @author Sean A. Irvine
 */
public class Aliquot extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    if (Z.ONE.equals(n)) {
      return Z.ZERO;
    } else if (n.isProbablePrime()) {
      return Z.ONE;
    }
    return Functions.SIGMA1.z(n).subtract(n);
  }
}
