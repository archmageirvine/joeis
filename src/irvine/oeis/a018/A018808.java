package irvine.oeis.a018;

import irvine.math.LongUtils;
import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A018808 Number of lines through at least 2 points of <code>an n</code> X n grid of points.
 * @author Sean A. Irvine
 */
public class A018808 extends MemorySequence {

  private MemoryFunction1<Z> mL1 = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      return n <= 1 ? Z.ZERO : A018808.this.get(n - 1).multiply2().subtract(get(n - 1)).add(r2(n));
    }
  };

  private MemoryFunction1<Z> mR1 = new MemoryFunction1<Z>() {
    @Override
    protected Z compute(final int n) {
      return n <= 1 ? Z.ZERO : get(n - 1).add(4 * (LongUtils.phi(n - 1) - ((n & 1) == 0 ? 0 : LongUtils.phi((n - 1) / 2))));
    }
  };

  private long r2(final int n) {
    return (n & 1) == 0
      ? LongUtils.phi(n - 1) * (n - 1)
      : (n & 3) == 1 ? LongUtils.phi(n - 1) * (n - 1) / 2 : 0;
  }

  @Override
  protected Z computeNext() {
    return isEmpty() ? Z.ZERO : mL1.get(size()).multiply2().subtract(get(size() - 1)).add(mR1.get(size()));
  }
}
