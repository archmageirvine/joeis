package irvine.math.function;

import irvine.math.z.Z;

/**
 * Return a <code>base</code>-bit number indicating which digits are present in a number.
 * @author Sean A. Irvine
 */
class Syndrome extends AbstractFunction2D {

  @Override
  public long getDefault() {
    return 10;
  }

  @Override
  public int i(final long base, Z n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    if (n.isZero()) {
      return 1;
    }
    int syndrome = 0;
    final Z zBase = Z.valueOf(base);
    final int allSeen = (1 << base) - 1;
    while (!n.isZero() && syndrome != allSeen) {
      final Z[] qr = n.divideAndRemainder(zBase);
      n = qr[0];
      syndrome |= 1 << qr[1].intValue();
    }
    return syndrome;
  }

  @Override
  public int i(final long base, long n) {
    if (base < 2) {
      throw new IllegalArgumentException();
    }
    int s = 0;
    do {
      s |= 1 << (n % base);
      n /= base;
    } while (n != 0);
    return s;
  }

  @Override
  public Z z(final long base, final Z n) {
    return Z.valueOf(i(base, n.longValueExact()));
  }
}
