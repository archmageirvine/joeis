package irvine.math.function;

import irvine.math.z.Z;

/**
 * Ceiling of a quotient of numerator and denominator of various types.
 * @author Georg Fischer
 */
class QuotientCeiling extends AbstractFunction2 {

  @Override
  public Z z(final Z num, final Z den) {
    return num.compareTo(Z.ZERO) < 0 ? num.divide(den) : (num.mod(den).isZero() ? num.divide(den) : num.divide(den).add(1));
  }

  @Override
  public Z z(final Z num, final long den) {
    return num.compareTo(Z.ZERO) < 0 ? num.divide(den) : (num.mod(den) == 0L ? num.divide(den) : num.divide(den).add(1));
  }

  @Override
  public Z z(final long num, final Z den) {
    return z(Z.valueOf(num), den);
  }

  @Override
  public Z z(final long num, final long den) {
    return Z.valueOf(l(num, den));
  }

  @Override
  public long l(final long num, final long den) {
    return num < 0 ? num / den : (num % den == 0 ? num / den : num / den + 1);
  }

  @Override
  public int i(final long num, final long den) {
    return Math.toIntExact(l(num, den));
  }
}

