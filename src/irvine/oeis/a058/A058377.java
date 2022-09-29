package irvine.oeis.a058;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058377 Number of solutions to 1 +- 2 +- 3 +- ... +- n = 0.
 * @author Sean A. Irvine
 */
public class A058377 extends MemoryFunctionInt2<Z> implements Sequence {

  // After Alois P. Heinz

  protected int mN = 0;

  @Override
  protected Z compute(final int n, final int i) {
    final int m = i * (i + 1) / 2;
    if (n > m) {
      return Z.ZERO;
    }
    if (n == m) {
      return Z.ONE;
    }
    return get(Math.abs(n - i), i - 1).add(get(n + i, i - 1));
  }

  @Override
  public Z next() {
    return (mN++ & 3) < 2 ? Z.ZERO : get(mN, mN - 1);
  }
}
