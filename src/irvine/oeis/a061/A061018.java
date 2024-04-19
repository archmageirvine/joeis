package irvine.oeis.a061;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061018 Triangle: a(n,m) = number of permutations of (1,2,...,n) with one or more fixed points in the m first positions.
 * @author Sean A. Irvine
 */
public class A061018 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private final MemoryFunctionInt2<Z> mT = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == -1 || n == 0) {
        return Z.ZERO;
      }
      if (m == 0) {
        return Functions.FACTORIAL.z(n).multiply(n);
      }
      return get(n, m - 1).subtract(get(n - 1, m - 1));
    }
  };

  private Z a(final int n, final int m) {
    return Functions.FACTORIAL.z(n - 1)
      .add(Integers.SINGLETON.sum(0, m - 2, k -> mT.get(n - 2, k)));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return a(mN, mM);
  }
}

