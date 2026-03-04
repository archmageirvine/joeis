package irvine.oeis.a083;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a081.A081874;

/**
 * A083906 Table read by rows: T(n, k) is the number of length n binary words with exactly k inversions.
 * @author Sean A. Irvine
 */
public class A083906 extends AbstractSequence {

  private int mN = 0;
  private int mM = -1;
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int k) {
      if (n < 0 || k < 0 || 4 * k > n * n) {
        return Z.ZERO;
      }
      if (n < 2) {
        return Z.valueOf(n + 1);
      }
      return get(n - 1, k).multiply2().subtract(get(n - 2, k)).add(get(n - 2, k - n + 1));
    }
  };

  private final A081874 mSeq = new A081874();

  /** Construct the sequence. */
  public A083906() {
    super(0);
  }

  @Override
  public Z next() {
    if (4 * ++mM > mN * mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mN, mM);
  }
}
