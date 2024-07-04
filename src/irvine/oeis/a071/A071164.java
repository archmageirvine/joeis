package irvine.oeis.a071;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071164 Square array read by antidiagonals of T(n,k)=T(n-1,k-n)+T(n-k,k-1) starting with T(n,k)=0 if either n or k are negative but with T(0,0)=1.
 * @author Sean A. Irvine
 */
public class A071164 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n < 0 || m < 0) {
        return Z.ZERO;
      }
      if (n == 0 && m == 0) {
        return Z.ONE;
      }
      return get(n - 1, m - n).add(get(n - m, m - 1));
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
