package irvine.math.function;

import irvine.math.z.Z;

/**
 * Thue Morse function.
 * @author Sean A. Irvine
 */
class ThueMorse extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return n.isZero() ? Z.ZERO : Z.valueOf(n.bitCount() & 1);
  }

  @Override
  public long l(final long n) {
    return n == 0 ? 0 : Long.bitCount(n) & 1;
  }
}
