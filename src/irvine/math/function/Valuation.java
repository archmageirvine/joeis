package irvine.math.function;

import irvine.math.z.Z;

/**
 * Valuation function.
 * The number of times the second argument divides into the first.
 * @author Sean A. Irvine
 */
class Valuation extends AbstractFunction2 {

  @Override
  public long l(final long n, final long m) {
    return i(n, m);
  }

  @Override
  public int i(long n, final long m) {
    if (n == 0) {
      return 0;
    }
    if (m == 2) {
      return Long.numberOfTrailingZeros(n);
    }
    int d = 0;
    while (n % m == 0) {
      ++d;
      n /= m;
    }
    return d;
  }

  @Override
  public int i(Z n, final Z m) {
    if (n.isZero()) {
      return 0; // convention
    }
    if (Z.TWO.equals(m)) {
      return (int) n.makeOdd().auxiliary();
    }
    int d = 0;
    Z[] qr;
    while ((qr = n.divideAndRemainder(m))[1].isZero()) {
      ++d;
      n = qr[0];
    }
    return d;
  }

  @Override
  public Z z(final Z n, final Z m) {
    return Z.valueOf(i(n, m));
  }
}
