package irvine.math.function;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;

/**
 * Prime counting function.
 * @author Sean A. Irvine
 */
class PrimePi extends AbstractFunction1 {

  @Override
  public Z z(final long n) {
    return Puma.primePiZ(n);
  }

  @Override
  public long l(final long n) {
    return Puma.primePi(n);
  }
}
