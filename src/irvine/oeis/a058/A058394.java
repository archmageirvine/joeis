package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunctionInt2Sequence;

/**
 * A058394 A square array based on natural numbers (A000027) with each term being the sum of 2 consecutive terms in the previous row.
 * @author Sean A. Irvine
 */
public class A058394 extends MemoryFunctionInt2Sequence<Z> {

  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final int n, final int m) {
    if (m == 0) {
      return Z.ONE;
    }
    if (n == 0) {
      return (m & 1) == 0 ? Z.valueOf(m / 2 + 1) : Z.ZERO;
    }
    return get(n - 1, m - 1).add(get(n - 1, m));
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

