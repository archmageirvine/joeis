package irvine.oeis.a166;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A166994 Triangle, read by rows, where T(n,k) = T(n,k-1)^2 - T(k-1,k-1)^2 for n&gt;=k&gt;1, with T(n,1) = n for n&gt;=1.
 * @author Sean A. Irvine
 */
public class A166994 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (m == 1) {
        return Z.valueOf(n);
      }
      return get(n, m - 1).square().subtract(get(m - 1, m - 1).square());
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
