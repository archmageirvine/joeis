package irvine.oeis.a066;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066117 Triangle read by rows: T(n,k) = T(n-1,k-1)*T(n,k-1) and T(n,1) = prime(n).
 * @author Sean A. Irvine
 */
public class A066117 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Functions.PRIME.z(n);
      }
      return get(n - 1, m - 1).multiply(get(n, m - 1));
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

