package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079409 Array T(m,n) (m&gt;=0, n&gt;=0) read by antidiagonals: T(0, 0) = 1, T(0, n) = 0 if n &gt; 0, T(m, n) = T(m-1, n - T(m-1, n)) + T(m-1, n - T(m-1, n-1)) if m &gt; 0.
 * @author Sean A. Irvine
 */
public class A079409 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return m == 0 ? Z.ONE : Z.ZERO;
      }
      if (n <= 0) {
        return Z.ZERO;
      }
      return get(n - 1, m - get(n - 1, m).intValueExact()).add(get(n - 1, m - get(n - 1, m - 1).intValueExact()));
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
