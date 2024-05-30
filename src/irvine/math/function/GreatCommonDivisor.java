package irvine.math.function;

import irvine.math.z.Z;

/**
 * Greatest common divisor function.
 * @author Sean A. Irvine
 */
class GreatCommonDivisor extends AbstractFunction2 {

  @Override
  public Z z(final Z n, final Z m) {
    return n.gcd(m);
  }

  @Override
  public Z z(final long n, final long m) {
    return Z.valueOf(l(n, m));
  }

  @Override
  public long l(long n, long m) {
    while (n != 0) {
      final long t = n;
      n = m % n;
      m = t;
    }
    return m;
  }
}
