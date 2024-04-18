package irvine.math.function;

import irvine.math.z.Z;

/**
 * Compute the Euler co-totient function.
 * @author Sean A. Irvine
 */
public class Cototient extends AbstractFunction1 {

  @Override
  public long l(final long n) {
    return n - Functions.PHI.l(n);
  }

  @Override
  public Z z(final Z n) {
    return n.subtract(Functions.PHI.z(n));
  }
}
