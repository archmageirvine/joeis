package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002808;
import irvine.oeis.memory.MemorySequence;

/**
 * A063174 Composites for which the row of the prime-composite array (A063173) includes the leftmost element of a zero-only antidiagonal.
 * @author Sean A. Irvine
 */
public class A063174 extends Sequence1 {

  private final MemorySequence mC = MemorySequence.cachedSequence(new A002808());
  private int mN = -1;

  private boolean is(final int n) {
    for (int k = 0; k <= n; ++k) {
      if (Functions.VALUATION.i(mC.a(n - k), Functions.PRIME.z(k + 1)) > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return mC.a(mN);
      }
    }
  }
}
