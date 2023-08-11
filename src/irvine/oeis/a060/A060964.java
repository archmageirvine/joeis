package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060964 Table by antidiagonals where T(n,k) = n*T(n,k-1) - T(n,k-2) with T(n,0) = 2 and T(n,1) = n.
 * @author Sean A. Irvine
 */
public class A060964 extends Sequence0 {

  private int mN = 0;
  private int mM = -1;

  private final MemoryFunctionInt2<Z> mT = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m <= 1) {
        return m == 0 ? Z.TWO : Z.valueOf(n);
      }
      return get(n, m - 1).multiply(n).subtract(get(n, m - 2));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mT.get(mM, mN - mM);
  }
}

