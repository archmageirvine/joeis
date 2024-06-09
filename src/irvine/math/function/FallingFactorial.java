package irvine.math.function;

import irvine.math.z.Z;

/**
 * Falling factorial.
 * @author Sean A. Irvine
 */
class FallingFactorial extends Pochhammer {

  @Override
  public Z z(final long n, final long m) {
    return super.z(n - m + 1, m);
  }
}
