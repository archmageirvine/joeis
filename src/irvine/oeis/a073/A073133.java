package irvine.oeis.a073;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073133 Table by antidiagonals of T(n,k) = n*T(n,k-1) + T(n,k-2) starting with T(n,1) = 1.
 * @author Sean A. Irvine
 */
public class A073133 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Z.ONE;
      }
      if (m < 1) {
        return Z.ZERO;
      }
      return get(n, m - 1).multiply(n).add(get(n, m - 2));
    }
  };

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN - mM, mM + 1);
  }
}
