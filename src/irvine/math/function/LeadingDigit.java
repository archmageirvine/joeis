package irvine.math.function;

import irvine.math.z.Z;

/**
 * First (most significant) digit of the number.
 * @author Georg Fischer
 */
class LeadingDigit extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public long l(final long base, Z n) {
    if (base <= 2) {
      if (base < 2) {
        throw new IllegalArgumentException();
      }
      return 1L;
    }
    if (n.isZero()) {
      return 0L;
    }
    final Z bp = Z.valueOf(base);
    while (n.compareTo(bp) >= 0) {
      final Z[] qr = n.divideAndRemainder(bp);
      n = qr[0];
    }
    return n.mod(base);
  }

  @Override
  public Z z(final long base, final Z n) {
    return Z.valueOf(l(base, n));
  }
}
