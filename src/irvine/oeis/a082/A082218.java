package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082218 Square array T(i,j) in which for every k, the k-th partial sums of every row and column are divisible by k. Array read by antidiagonals, alternating upwards and downwards. Each entry is the least number not already used that fits the divisibility requirement.
 * @author Sean A. Irvine
 */
public class A082218 extends Sequence1 {

  // We number the triangle from (0,0)
  private final TreeSet<Long> mUsed = new TreeSet<>();
  private int mN = 0;
  private int mM = -1;
  private long mLeastUnused = 2;
  protected final MemoryFunctionInt2<Long> mB = new MemoryFunctionInt2<>() {

    private boolean isOk(final int n, final int m, final long k) {
      // Check row
      long rowSum = k;
      for (int j = 0; j < m; ++j) {
        rowSum += get(n, j);
      }
      if (rowSum % (m + 1) != 0) {
        return false;
      }
      // Check column
      long colSum = k;
      for (int j = 0; j < n; ++j) {
        colSum += get(j, m);
      }
      return colSum % (n + 1) == 0;
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
    return Z.valueOf((mN & 1) == 0 ? mB.get(mN - mM, mM) : mB.get(mM, mN - mM));
  }
}
