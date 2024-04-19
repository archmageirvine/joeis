package irvine.math.function;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;

/**
 * Rotate a number by one digit to the right.
 * @author Sean A. Irvine
 */
class Multifactorial extends AbstractFunction2 {

  private final MemoryFunction2<Long, Z> mF = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Long m, final Long n) {
      if (n < 0) {
        if (m == 2 && n == -1) {
          return Z.ONE; // special case
        }
        throw new IllegalArgumentException("n must be nonnegative");
      }
      if (n <= m) {
        return Z.valueOf(Math.max(n, 1));
      }
      return get(m, n - m).multiply(n);
    }
  };

  @Override
  public long getDefault() {
    return 2; // Double factorial
  }

  @Override
  public Z z(final long m, final long n) {
    return mF.get(m, n);
  }
}
