package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082025 Square array of distinct positive integers, in which neighboring entries (both orthogonal and diagonal) are coprime. The array is read by antidiagonals, alternating upwards and downwards. Each entry is the smallest positive integer not already used that is coprime to all of the neighboring entries that are earlier in the sequence.
 * @author Sean A. Irvine
 */
public class A082025 extends Sequence0 {

  // We number the triangle from (0,0)
  private final TreeSet<Long> mUsed = new TreeSet<>();
  private int mN = 0;
  private int mM = -1;
  private long mLeastUnused = 2;
  protected final MemoryFunctionInt2<Long> mB = new MemoryFunctionInt2<>() {

    private boolean isOk(final int n, final int m, final long k) {
      // Check row
      if (m > 0 && Functions.GCD.l(get(n, m - 1), k) != 1) {
        return false;
      }
      if (n > 0 && Functions.GCD.l(get(n - 1, m), k) != 1) {
        return false;
      }
      if (m > 0 && n > 0 && Functions.GCD.l(get(n - 1, m - 1), k) != 1) {
        return false;
      }
      final int h = 1 - 2 * ((n + m) & 1);
      if (n > 0 && h < 0 && Functions.GCD.l(get(n - 1, m + 1), k) != 1) {
        return false;
      }
      if (m > 0 && h > 0 && Functions.GCD.l(get(n + 1, m - 1), k) != 1) {
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
