package irvine.oeis.a053;

import irvine.math.IntegerUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt3Sequence;

/**
 * A053197 Number of level partitions of n.
 * @author Sean A. Irvine
 */
public class A053197 extends MemoryFunctionInt3Sequence<Z> {

  // After Alois P. Heinz

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;

  @Override
  protected Z compute(final int n, final int i, final int p) {
    if (n == 0) {
      return Z.ONE;
    }
    if (i < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= n / i; ++j) {
      sum = sum.add(get(n - i * j, i - p, p));
    }
    return sum;
  }

  private Z compute(final int n, final int m) {
    if (n == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= m; ++j) {
      final int h = n >>> j;
      sum = sum.add(get(n, (h - 1 + (h & 1)) << j, 1 << (j + 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return compute(mN, IntegerUtils.lg(mN));
  }
}
