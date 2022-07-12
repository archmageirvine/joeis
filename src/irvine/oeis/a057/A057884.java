package irvine.oeis.a057;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057884 A square array based on tetrahedral numbers (A000292) with each term being the sum of 2 consecutive terms in the previous row.
 * @author Sean A. Irvine
 */
public class A057884 extends MemoryFunctionInt2<Z> implements Sequence {

  private int mN = 0;
  private int mM = -1;

  @Override
  protected Z compute(final int n, final int k) {
    if (k == 0) {
      return Z.ONE;
    }
    if (k == 1) {
      return Z.valueOf(n);
    }
    if (n == 0) {
      return (k & 1) == 0 ? get(4, k / 2) : Z.ZERO;
    }
    if (n == 1 && k == 2) {
      return Z.FOUR;
    }
    return get(n - 1, k).add(get(n - 1, k - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }
}

