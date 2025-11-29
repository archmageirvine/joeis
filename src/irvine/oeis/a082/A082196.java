package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082196 Triangle read by rows in which the n-th row contains n distinct numbers (not occurring earlier) such that every entry is coprime to its neighbor in all directions.
 * @author Sean A. Irvine
 */
public class A082196 extends Sequence1 {

  // We number the triangle from (0,0)
  private final TreeSet<Long> mUsed = new TreeSet<>();
  private int mN = 0;
  private int mM = -1;
  private long mLeastUnused = 2;
  protected final MemoryFunctionInt2<Long> mB = new MemoryFunctionInt2<>() {

    private boolean isOk(final int n, final int m, final long k) {
      // The second conditions like (n>0 || m>1) avoid the 1 at position (0,0)
      if (m > 0 && Functions.GCD.l(get(n, m - 1), k) != 1) {
        return false;
      }
      if (n > 0 && m < n && Functions.GCD.l(get(n - 1, m), k) != 1) {
        return false;
      }
      if (m > 0 && n > 0 && Functions.GCD.l(get(n - 1, m - 1), k) != 1) {
        return false;
      }
      if (m < n - 1 && Functions.GCD.l(get(n - 1, m + 1), k) != 1) {
        return false;
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
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mB.get(mN, mM));
  }
}
