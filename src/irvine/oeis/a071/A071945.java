package irvine.oeis.a071;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071945 Triangle T(n,k) read by rows giving number of underdiagonal lattice paths from (0,0) to (n,k) using steps R=(1,0), V=(0,1) and D=(2,1).
 * @author Sean A. Irvine
 */
public class A071945 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0 && m == 0) {
        return Z.ONE;
      }
      if (m < 0 || m > n) {
        return Z.ZERO;
      }
      return get(n - 1, m).add(get(n, m - 1)).add(get(n - 2, m - 1));
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
