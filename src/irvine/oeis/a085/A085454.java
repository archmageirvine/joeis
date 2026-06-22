package irvine.oeis.a085;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085454 Array defined by T(i,0) = i, T(0,j) = 2*j, T(i,j) = T(i-1,j) + T(i-1,j-1) read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A085454 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 0) {
        return Z.valueOf(n);
      }
      if (n == 0) {
        return Z.valueOf(2L * m);
      }
      return get(n - 1, m).add(get(n - 1, m - 1));
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
