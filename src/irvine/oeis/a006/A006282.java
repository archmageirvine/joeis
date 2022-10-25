package irvine.oeis.a006;

import java.io.Serializable;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A006282 Sorting numbers: number of comparisons in Batcher's parallel sort.
 * @author Sean A. Irvine
 */
public class A006282 extends MemorySequence {

  private static final class CFunction extends MemoryFunction2<Integer, Z> implements Serializable {

    @Override
    protected Z compute(final Integer m, final Integer n) {
      if (m * n <= 1) {
        return Z.valueOf(m * (long) n);
      }
      return get((m + 1) / 2, (n + 1) / 2).add(get(m / 2, n / 2)).add((m + n - 1) / 2);
    }
  }

  private final CFunction mC = new CFunction();

  {
    setOffset(1);
    add(null); // 0th element
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n == 1) {
      return Z.ZERO;
    }
    return a((n + 1) / 2).add(a(n / 2)).add(mC.get((n + 1) / 2, n / 2));
  }

}
