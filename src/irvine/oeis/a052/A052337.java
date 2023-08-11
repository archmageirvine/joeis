package irvine.oeis.a052;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A052337 Number of partitions into at most a(1) copies of 1, a(2) copies of 2, ...
 * @author Sean A. Irvine
 */
public class A052337 extends MemorySequence {

  // After Alois P. Heinz

  private final MemoryFunction2<Integer, Z> mB = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Integer n, final Integer m) {
      if (n == 0) {
        return Z.ONE;
      }
      if (m < 1) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int j = 0; j <= a(m).min(Z.valueOf(n / m)).intValueExact(); ++j) {
        sum = sum.add(get(n - m * j, m - 1));
      }
      return sum;
    }
  };

  @Override
  protected Z computeNext() {
    final int n = size();
    return mB.get(n, n - 1).add(n == 0 ? 0 : 1);
  }
}
