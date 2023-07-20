package irvine.oeis.a064;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A064381 Number of subsets of {2,...,n} such that the product of their elements is congruent to 0 (mod n+1).
 * @author Sean A. Irvine
 */
public class A064381 extends MemorySequence {

  // After Alois P. Heinz

  {
    setOffset(2);
    add(null);
    add(null);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    final int m = n + 1;
    final MemoryFunctionInt2<Z> b = new MemoryFunctionInt2<>() {
      @Override
      protected Z compute(final int n, final int p) {
        if (p == 0) {
          return Z.ONE.shiftLeft(n - 1);
        }
        if (n < 2) {
          return Z.ZERO;
        }
        return get(n - 1, p).add(get(n - 1, (p * n) % m));
      }
    };
    return b.get(n, 1);
  }
}
