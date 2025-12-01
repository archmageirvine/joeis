package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.MemoryFunctionInt2;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082228 In the following square array A(n,k), numbers (not occurring earlier) are entered like this, A(1, 1), A(1, 2), A(2, 1), A(3, 1), A(2, 2), A(1, 3), A(1, 4), A(2, 3), A(3, 2), A(4, 1), A(5, 1), A(4, 2), ... such that every partial sum (of length &gt; 1) of the rows is composite and every partial sum (of length &gt; 1) of the columns is prime. The sequence contains the terms in the order in which they are entered (with A(1,1) = 1).
 * @author Sean A. Irvine
 */
public class A082228 extends Sequence1 {

  // We number the triangle from (0,0)
  private final TreeSet<Long> mUsed = new TreeSet<>();
  private int mN = 0;
  private int mM = -1;
  private long mLeastUnused = 2;
  protected final MemoryFunctionInt2<Long> mB = new MemoryFunctionInt2<>() {

    private boolean isOk(final int n, final int m, final long k) {
      // Check row
      if (m > 0) {
        long rowSum = k;
        for (int j = 0; j < m; ++j) {
          rowSum += get(n, j);
        }
        if (Predicates.PRIME.is(rowSum)) {
          return false;
        }
      }
      if (n > 0) {
        // Check column
        long colSum = k;
        for (int j = 0; j < n; ++j) {
          colSum += get(j, m);
        }
        return Predicates.PRIME.is(colSum);
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
    return Z.valueOf((mN & 1) == 0 ? mB.get(mN - mM, mM) : mB.get(mM, mN - mM));
  }
}
