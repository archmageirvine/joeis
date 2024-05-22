package irvine.math.function;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * Generalized sum of divisors function.
 * @author Sean A. Irvine
 */
class Sigma extends AbstractFunction2 {

  @Override
  public long getDefault() {
    return 1;
  }

  @Override
  public Z z(final long base, Z n) {
    // These special cases handled here because non-factorization strategy sometimes used
    if (base == 0) {
      return Functions.SIGMA0.z(n);
    } else if (base == 1) {
      return Functions.SIGMA1.z(n);
    } else {
      return Jaguar.factor(n).sigma(base);
    }
  }

  @Override
  public long l(final long base, long n) {
    // These special cases handled here because non-factorization strategy sometimes used
    if (base == 0) {
      return Functions.SIGMA0.l(n);
    } else if (base == 1) {
      return Functions.SIGMA1.l(n);
    } else {
      return Jaguar.factor(n).sigma(base).longValueExact();
    }
  }
}
