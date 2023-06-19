package irvine.oeis.a064;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064190 Triangle T(n,k) generalizing the tangent numbers.
 * @author Sean A. Irvine
 */
public class A064190 extends Sequence0 {

  private int mN = 0;
  private int mM = 0;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m <= 0 || m > n) {
        return Z.ZERO;
      }
      if (n == 1) {
        return Z.ONE;
      }
      return Integers.SINGLETON.sum(m -1, n - 1, k -> get(n - 1, k)).multiply(m).multiply(m + 1);
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
