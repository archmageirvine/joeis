package irvine.math.function;

import irvine.math.z.Z;

/**
 * Truncating cube root (floor cube root).
 * @author Sean A. Irvine
 */
class CubeRoot extends AbstractFunction1 {

  @Override
  public Z z(final Z n) {
    return n.root(3);
  }

  @Override
  public long l(final long n) {
    return z(Z.valueOf(n)).longValue();
  }

  @Override
  public int i(final int n) {
    return (int) Math.cbrt(n);
  }
}
