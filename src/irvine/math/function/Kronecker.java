package irvine.math.function;

import irvine.math.z.Z;

/**
 * Kronecker function.
 * @author Sean A. Irvine
 */
class Kronecker extends AbstractFunction2 {

  @Override
  public long l(final long n, final long m) {
    return i(n, m);
  }

  @Override
  public int i(final long n, final long m) {
    if (m == -1) {
      return n >= 0 ? 1 : -1;
    } else if (m == 0) {
      return n == 1 || n == -1 ? 1 : 0;
    } else if (m == 2) {
      if ((n & 1) == 0) {
        return 0;
      }
      return (n & 7) == 1 || (n & 7) == 7 ? 1 : -1;
    } else if ((m & 1) == 0) {
      return i(n, 2) * i(n, m / 2);
    }
    return Functions.JACOBI.i(n, m);
  }

  @Override
  public Z z(final Z n, final Z m) {
    return Z.valueOf(i(n.longValueExact(), m.longValueExact()));
  }
}
