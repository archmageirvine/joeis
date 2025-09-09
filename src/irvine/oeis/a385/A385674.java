package irvine.oeis.a385;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385674 Triangle read by rows: T(n,n) = 1 and T(n,k) = (T(n-1,k) | T(n-2,k) | ... | T(n-k,k)) + 1, where | is bitwise OR, (0&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A385674 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n == k) {
        return Z.ONE;
      }
      Z s = Z.ZERO;
      for (int j = 1; j <= Math.min(k, n - k); ++j) {
        s = s.or(get(n - j, k));
      }
      return s.add(1);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
