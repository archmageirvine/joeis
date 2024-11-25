package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt2;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072950.
 * @author Sean A. Irvine
 */
public class A073346 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return Predicates.POWER_OF_TWO.is(n + 1) ? Z.ONE : Z.ZERO;
      }
      if (n == 0) {
        return Z.ZERO;
      }
      Z sum = Z.ZERO;
      for (int i = 0; i < n; ++i) {
        Z s = Z.ZERO;
        final int lim = i <= (n - 1) / 2 ? m : m - 1;
        for (int j = 0; j < lim; ++j) {
          s = s.add(get(i, j));
        }
        sum = sum.add(s.multiply(get(n - i - 1, m - 1)));
      }
      sum = sum.multiply2();
      if ((n & 1) == 1) {
        sum = sum.subtract(get((n - 1) / 2, m - 1).square());
      }
      if (m == 1 && Predicates.POWER_OF_TWO.is(n + 1)) {
        sum = sum.subtract(1);
      }
      return sum;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM, mM);
  }
}

