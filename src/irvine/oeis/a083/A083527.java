package irvine.oeis.a083;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083527 a(n) is the number of times that sums 1+-4+-9+-16+-...+-n^2 of the first n squares is zero. There are 2^(n-1) choices for the sign patterns.
 * @author Sean A. Irvine
 */
public class A083527 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int i) {
      final long m = (1 + (3 + 2L * i) * i) * i / 6;
      if (n > m) {
        return Z.ZERO;
      }
      if (n == m) {
        return Z.ONE;
      }
      return get(Math.abs(n - i * i), i - 1).add(get(n + i * i, i - 1));
    }
  };

  @Override
  public Z next() {
    ++mN;
    return ((mN - 1) & 3) < 2 ? Z.ZERO : mB.get(mN * mN, mN - 1);
  }
}
