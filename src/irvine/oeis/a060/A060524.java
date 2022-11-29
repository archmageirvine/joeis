package irvine.oeis.a060;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060524 Triangle read by rows: T(n,k) = number of degree-n permutations with k odd cycles, k=0..n, n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A060524 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (k < 0 || k > n) {
        return Z.ZERO;
      }
      if (n == 0) {
        return Z.ONE;
      }
      return get(n - 1, k - 1).add(get(n - 2, k).multiply(n - 1).multiply(n - 1));
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
