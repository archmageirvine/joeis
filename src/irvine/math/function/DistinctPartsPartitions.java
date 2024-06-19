package irvine.math.function;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;

/**
 * Number of partitions into distinct parts.
 * @author Sean A. Irvine
 */
class DistinctPartsPartitions extends AbstractFunction1 {

  // Use method of Evangelos Georgiadis, Andrew V. Sutherland, Kiran S. Kedlaya.

  private final MemoryFunction1<Z> mB = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      if (n == 0) {
        return Z.ONE;
      }
      int k = 1;
      Z sum = Z.ZERO;
      int s;
      while ((s = k * k) <= n) {
        if ((k & 1) == 0) {
          sum = sum.subtract(get(n - s));
        } else {
          sum = sum.add(get(n - s));
        }
        ++k;
      }
      sum = sum.multiply2();
      final long nn = 2L * n;
      final long d = Functions.SQRT.l(1 + 24L * n);
      final long j0 = (d - 1) / 6;
      final long tj0 = 3 * j0;
      final long sigma;
      if (nn == j0 * (tj0 + 1) || nn == j0 * (tj0 - 1)) {
        sigma = (j0 & 1) == 0 ? 1 : -1;
      } else {
        final long j1 = (d + 1) / 6;
        final long tj1 = 3 * j1;
        if (nn == j1 * (tj1 + 1) || nn == j1 * (tj1 - 1)) {
          sigma = (j1 & 1) == 0 ? 1 : -1;
        } else {
          sigma = 0;
        }
      }
      //System.out.println("sigma=" + sigma + " j0=" + j0 + " j1=" + j1);
      return sum.add(sigma);
    }
  };

  @Override
  public Z z(final int n) {
    return mB.get(n);
  }

  @Override
  public Z z(final long n) {
    if (n > Integer.MAX_VALUE) {
      throw new UnsupportedOperationException();
    }
    return z((int) n);
  }
}
