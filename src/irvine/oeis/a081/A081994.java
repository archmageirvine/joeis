package irvine.oeis.a081;

import java.util.TreeSet;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081994 Triangle read by rows in which the n-th row contains n numbers not occurring earlier such that every entry is coprime to all the members of the row and column it belongs.
 * @author Sean A. Irvine
 */
public class A081994 extends Sequence1 {

  // We number the triangle from (0,0)
  private int mN = 0;
  private int mM = -1;
  private long mLeastUnused = 2;
  private final TreeSet<Long> mUsed = new TreeSet<>();
  protected final MemoryFunctionInt2<Long> mB = new MemoryFunctionInt2<>() {

    private boolean isOk(final int n, final int m, final long k) {
      // Check row
      for (int j = 0; j < m; ++j) {
        if (Functions.GCD.l(get(n, j), k) > 1) {
          return false;
        }
      }
      // Check column
      for (int j = m; j < n; ++j) {
        if (Functions.GCD.l(get(j, m), k) > 1) {
          return false;
        }
      }
      return true;
    }

    @Override
    protected Long compute(final int n, final int m) {
      if (n == 0) {
        return 1L;
      }
      while (mUsed.remove(mLeastUnused)) {
        ++mLeastUnused;
      }
      long k = mLeastUnused;
      while (mUsed.contains(k) || !isOk(n, m, k)) {
        ++k;
      }
      mUsed.add(k);
      return k;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      // Starting a new row
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mB.get(mN, mM));
  }
}
