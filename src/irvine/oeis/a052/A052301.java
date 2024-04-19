package irvine.oeis.a052;

import irvine.math.MemoryFunction2;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A052301 Number of asymmetric rooted Greg trees.
 * @author Sean A. Irvine
 */
public class A052301 extends MemorySequence {

  // After Alois P. Heinz

  {
    setOffset(1);
    add(Z.ZERO);
  }

  private final MemoryFunction2<Integer, Z> mB = new MemoryFunction2<>() {

    @Override
    protected Z compute(final Integer n, final Integer m) {
      if (n == 0) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      if (m > 0) {
        for (int j = 0; j <= n / m; ++j) {
          sum = sum.add(Binomial.binomial(a(m), Z.valueOf(j)).multiply(get(n - m * j, m - 1)));
        }
      }
      return sum;
    }
  };

  @Override
  protected Z computeNext() {
    final int n = size();
    return mB.get(n - 1, n - 1).add(mB.get(n, n - 1));
  }
}
