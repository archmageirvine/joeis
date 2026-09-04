package irvine.math.function;

import irvine.math.z.Z;

/**
 * Ceiling of a quotient of numerator and denominator of various types.
 * @author Georg Fischer
 */
class QuotientCeiling extends AbstractFunction2 {

  @Override
  public Z z(final long num, final long den) {
    return Z.valueOf(num > 0 ? (num + 1) / den : num / den);
  }

  @Override
  public long l(final long num, final long den) {
    return num > 0 ? (num + 1) / den : num / den;
  }

  @Override
  public int i(final long num, final long den) {
    return Math.toIntExact(num > 0 ? (num + 1) / den : num / den);
  }

}
