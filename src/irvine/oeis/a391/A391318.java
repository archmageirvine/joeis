package irvine.oeis.a391;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A391318 Triangle array read by rows: T(n,k) = T(n-1,k) + T(n-1,k-1) + T(n-2,k-1) + 1 with T(0,0) = T(n,-1) = T(n,n+1) = 0.
 * @author Sean A. Irvine
 */
public class A391318 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0 || m < 0 || m > n) {
        return Z.ZERO;
      }
      return get(n - 1, m).add(get(n - 1, m - 1)).add(get(n - 2, m - 1)).add(1);
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
