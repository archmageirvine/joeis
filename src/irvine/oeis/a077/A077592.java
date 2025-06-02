package irvine.oeis.a077;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077592 Table by antidiagonals of tau_k(n), the k-th Piltz function (see A007425), or n-th term of the sequence resulting from applying the inverse M\u00f6bius transform (k-1) times to the all-ones sequence.
 * @author Sean A. Irvine
 */
public class A077592 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      return m == 1 ? Z.ONE : Integers.SINGLETON.sumdiv(n, d -> mB.get(d, m - 1));
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mM, mN + 1 - mM);
  }
}
