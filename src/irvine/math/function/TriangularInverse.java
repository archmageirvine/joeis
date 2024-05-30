package irvine.math.function;

import irvine.math.z.Z;

/**
 * Inverse of triangular numbers.
 * @author Sean A. Irvine
 */
class TriangularInverse extends AbstractFunction1 {

  private static final long MAX = 1L << (Long.SIZE - 3);

  @Override
  public Z z(final Z n) {
    return n.shiftLeft(3).add(1).sqrt().subtract(1).divide2();
  }

  @Override
  public long l(final long n) {
    return n >= MAX ? z(n).longValueExact() : (Functions.SQRT.l(8L * n + 1) - 1) / 2;
  }
}
