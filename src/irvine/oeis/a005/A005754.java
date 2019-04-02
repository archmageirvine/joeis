package irvine.oeis.a005;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005754 Number of planted identity matched trees with n nodes.
 * @author Sean A. Irvine
 */
public class A005754 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private static class BFunction extends MemoryFunction2<Long, Z> {
    @Override
    protected Z compute(final Long n, final Long k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (k < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      final Z m = get(k - 1, k - 1).multiply2();
      for (long j = 0; j <= n / k; ++j) {
        sum = sum.add(Binomial.binomial(m, Z.valueOf(j)).multiply(get(n - k * j, k - 1)));
      }
      return sum;
    }
  }

  private final BFunction mB = new BFunction();
  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long k) {
    if (n == 0) {
      return Z.ONE;
    }
    if (k < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (long j = 0; j <= n / k; ++j) {
      sum = sum.add(Binomial.binomial(mB.get(k - 1, k - 1), Z.valueOf(j)).multiply(get(n - k * j, k - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN, mN);
  }
}
