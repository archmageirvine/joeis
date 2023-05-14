package irvine.oeis.a063;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063746 Triangle read by rows giving number of partitions of k (k=0 .. n^2) with Ferrers plot fitting in an n X n box.
 * @author Sean A. Irvine
 */
public class A063746 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int i, final int k) {
      if (n == 0) {
        return Z.ONE;
      }
      if (i < 1 || k < 1) {
        return Z.ZERO;
      }
      return get(n, i - 1, k).add(i > n ? Z.ZERO : get(n - i, i, k - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN * mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM, Math.min(mN, mM), mN);
  }
}
