package irvine.oeis.a081;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081998 Square array read by antidiagonals, alternating upwards and downwards: T(i, j) is the least number that is greater than the previous term and coprime to every number on the same row or column.
 * @author Sean A. Irvine
 */
public class A081998 extends Sequence0 {

  // We number the triangle from (0,0)
  private int mN = 0;
  private int mM = -1;
  private long mR = 1;
  protected final MemoryFunctionInt2<Long> mB = new MemoryFunctionInt2<>() {

    private boolean isOk(final int n, final int m, final long k) {
      // Check row
      for (int j = 0; j < m; ++j) {
        if (Functions.GCD.l(get(n, j), k) > 1) {
          return false;
        }
      }
      // Check column
      for (int j = 0; j < n; ++j) {
        if (Functions.GCD.l(get(j, m), k) > 1) {
          return false;
        }
      }
      return true;
    }

    @Override
    protected Long compute(final int n, final int m) {
      if (n == 0 && m == 0) {
        return 1L;
      }
      while (!isOk(n, m, ++mR)) {
        // do nothing
      }
      return mR;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      // Starting a new row
      ++mN;
      mM = 0;
    }
    return Z.valueOf((mN & 1) == 0 ? mB.get(mN - mM, mM) : mB.get(mM, mN - mM));
  }
}
