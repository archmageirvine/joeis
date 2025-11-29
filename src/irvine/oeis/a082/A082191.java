package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082191 In a square array, positive integers are entered as follows. Start with a(1, 1)=1. Then enter numbers in this order: a(1, 2), a(2, 1), a(3, 1), a(2, 2), a(1, 3), a(1, 4), a(2, 3), a(3, 2), a(4, 1), a(5, 1), a(4, 2), ... such that every entry is the smallest not yet used and such that every entry greater than 1 has a common divisor with its neighbors (in all directions) which are greater than 1.
 * @author Sean A. Irvine
 */
public class A082191 extends Sequence1 {

  // We number the triangle from (0,0)
  private final TreeSet<Long> mUsed = new TreeSet<>();
  private int mN = 0;
  private int mM = -1;
  private long mLeastUnused = 2;
  protected final MemoryFunctionInt2<Long> mB = new MemoryFunctionInt2<>() {

    private boolean isOk(final int n, final int m, final long k) {
      // The second conditions like (n>0 || m>1) avoid the 1 at position (0,0)
      if (m > 0 && (n > 0 || m > 1) && Functions.GCD.l(get(n, m - 1), k) == 1) {
        return false;
      }
      if (n > 0 && (n > 1 || m > 0) && Functions.GCD.l(get(n - 1, m), k) == 1) {
        return false;
      }
      if (m > 0 && n > 0 && (n > 1 || m > 1) && Functions.GCD.l(get(n - 1, m - 1), k) == 1) {
        return false;
      }
      final int h = 1 - 2 * ((n + m) & 1);
      if (n > 0 && h < 0 && Functions.GCD.l(get(n - 1, m + 1), k) == 1) {
        return false;
      }
      if (m > 0 && h > 0 && Functions.GCD.l(get(n + 1, m - 1), k) == 1) {
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
      // Starting a new row
      ++mN;
      mM = 0;
    }
    return Z.valueOf((mN & 1) == 0 ? mB.get(mN - mM, mM) : mB.get(mM, mN - mM));
  }
}
