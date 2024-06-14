package irvine.math.function;

import irvine.math.z.Z;

/**
 * Expand the number into a primorial base exp representation.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
class PrimorialBaseExp extends AbstractFunction1 {

  // primorial base cannot unambiguously represent n &gt;= 2100 = 10*7*5*3*2

  @Override
  public Z z(long n) {
    if (n <= 2) {
      return Z.valueOf(n + 1);
    }
    if (n >= 7420738134810L) {
      throw new UnsupportedOperationException("Ambiguous primorial base representation");
    }
    int ip = 1;
    while (Functions.PRIMORIAL_COUNT.l(ip) <= n) {
      ++ip;
    }
    Z result = Z.ONE;
    while (n > 0) {
      final long pm = Functions.PRIMORIAL_COUNT.l(--ip);
      final long digit = n / pm;
      n -= pm * digit;
      if (digit != 0) {
        result = result.multiply(Functions.PRIME.z(ip + 1).pow(digit));
      }
    }
    return result;
  }
}
