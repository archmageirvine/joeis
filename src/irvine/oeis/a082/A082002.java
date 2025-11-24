package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082002 Square array read by antidiagonals, alternating upwards and downwards: T(1, 1) = 1 and every other entry is the smallest number not already used that has a common factor with every number in its row and column, not including the 1.
 * @author Sean A. Irvine
 */
public class A082002 extends Sequence0 {

  // We number the triangle from (0,0)
  private final TreeSet<Long> mUsed = new TreeSet<>();
  private int mN = 0;
  private int mM = -1;
  private long mLeastUnused = 2;
  protected final MemoryFunctionInt2<Long> mB = new MemoryFunctionInt2<>() {

    private boolean isOk(final int n, final int m, final long k) {
      // Check row
      for (int j = n == 0 ? 1 : 0; j < m; ++j) {
        if (Functions.GCD.l(get(n, j), k) == 1) {
          return false;
        }
      }
      // Check column
      for (int j = m == 0 ? 1 : 0; j < n; ++j) {
        if (Functions.GCD.l(get(j, m), k) == 1) {
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
      while (mUsed.remove(mLeastUnused)) {
        ++mLeastUnused;
      }
      long r = mLeastUnused;
      while (mUsed.contains(r) || !isOk(n, m, r)) {
        ++r;
      }
      mUsed.add(r);
      return r;
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
