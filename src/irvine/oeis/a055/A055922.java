package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A055922 Number of partitions of n in which each part occurs an odd number (or zero) times.
 * @author Sean A. Irvine
 */
public class A055922 extends MemoryFunction2Sequence<Integer, Z> {

  // After Alois P. Heinz

  private int mN = -1;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n / m; k += 2) {
      sum = sum.add(get(n - m * k, m - 1));
    }
    return sum.add(get(n, m - 1));
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
