package irvine.oeis.a079;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079542 Triangular array: T(n,1) = T(n,n) = n and T(n,k) = lcm(T(n-1,k-1), T(n-1,k)) for 1 &lt; k &lt; n.
 * @author Sean A. Irvine
 */
public class A079542 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return m == 1 || m == n ? Z.valueOf(n) : get(n - 1, m - 1).lcm(get(n - 1, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}
