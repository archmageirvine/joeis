package irvine.oeis.a057;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A057601 a(0) = a(1) = 1; a(n+1) is the number of partitions of n into parts a(k), 0 &lt;= k &lt;= n, each k occurring at most once.
 * @author Sean A. Irvine
 */
public class A057601 extends MemorySequence {

  // After Alois P. Heinz

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int i) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 0) {
        return Z.ZERO;
      }
      final Z b = get(n, i - 1);
      final int ai = a(i).intValueExact();
      return ai > n ? b : b.add(get(n - ai, i - 1));
    }
  };

  @Override
  protected Z computeNext() {
    final int n = size();
    return n < 2 ? Z.ONE : mB.get(n - 1, n - 1);
  }
}
