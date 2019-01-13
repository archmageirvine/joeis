package irvine.oeis.a003;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005130;

/**
 * A003827.
 * @author Sean A. Irvine
 */
public class A003827 extends MemorySequence {

  /*
  // Brute force implementation before Christine Bessenrodt determined the correct formula

  private static final class AlternatingSignMatrix {
    private final int[][] mValue;
    private final int[] mRowSum;
    private final int[] mColSum;
    private final int[][] mRowCounts;
    private final int[][] mColCounts;
    
    private AlternatingSignMatrix(final int n) {
      mValue = new int[n][n];
      mRowSum = new int[n];
      mColSum = new int[n];
      mRowCounts = new int[n][3];
      mColCounts = new int[n][3];
    }

    private void set(final int x, final int y, final int v) {
      mValue[y][x] = v;
      mRowSum[y] += v;
      mColSum[x] += v;
      mRowCounts[y][1 + v]++;
      mColCounts[x][1 + v]++;
    }

    private void unset(final int x, final int y) {
      final int v = mValue[y][x];
      mValue[y][x] = 0;
      mRowSum[y] -= v;
      mColSum[x] -= v;
      mRowCounts[y][1 + v]--;
      mColCounts[x][1 + v]--;
    }

    private int prevY(final int x, final int y) {
      int py = 0;
      for (int k = y; k >= 0 && py == 0; --k) {
        py = get(x, k);
      }
      return py;
    }

    private boolean isCore() {
      // Assumes matrix is already a valid alternating sign matrix
      final int n = mRowSum.length;
      for (int x = 0; x < n; ++x) {
        for (int y = 0; y < n; ++y) {
          if (mValue[y][x] == 1 && (mRowCounts[y][0] == 0 && mColCounts[x][0] == 0)) {
            return false;
          }
        }
      }
      return true;
    }

    private int rowSum(final int y) {
      return mRowSum[y];
    }

    private int colSum(final int x) {
      return mColSum[x];
    }

    private int get(final int x, final int y) {
      return mValue[y][x];
    }

    @Override
    public String toString() {
      return Arrays.deepToString(mValue);
    }
  }

  private int mN = 2;
  private long mCount = 0;
  private long mTotal = 0; // Successfully tracks A005130

  private void solve(final AlternatingSignMatrix matrix, final int x, final int y, final int prevX) {
    if (y >= mN) {
      if (matrix.isCore()) {
        //System.out.println(matrix.toString());
        ++mCount;
      }
      ++mTotal;
      return;
    }
    if (x >= mN) {
      if (matrix.rowSum(y) == 1) {
        solve(matrix, 0, y + 1, 0);
      }
      return;
    }
    final int prevY = matrix.prevY(x, y - 1);
    if (prevX != -1 && prevY != -1) {
      matrix.set(x, y, -1);
      if (y < mN - 1 || matrix.colSum(x) == 1) {
        solve(matrix, x + 1, y, -1);
      }
      matrix.unset(x, y);
    }
    if (y < mN - 1 || matrix.colSum(x) == 1) {
      //matrix.set(x, y, 0);
      solve(matrix, x + 1, y, prevX);
      //matrix.unset(x, y);
    }
    if (prevX != 1 && prevY != 1) {
      matrix.set(x, y, 1);
      if (y < mN - 1 || matrix.colSum(x) == 1) {
        solve(matrix, x + 1, y, 1);
      }
      matrix.unset(x, y);
    }
  }

  @Override
  public Z next() {
    mCount = 0;
    mTotal = 0;
    solve(new AlternatingSignMatrix(++mN), 0, 0, 0);
    System.out.println("Total: " + mTotal);
    return Z.valueOf(mCount);
  }
  */

  private final MemoryFactorial mF = new MemoryFactorial();
  private final Sequence mAll = new A005130();
  {
    mAll.next();
    mAll.next();
    mAll.next();
    add(Z.ZERO);
    add(Z.ZERO);
    add(Z.ZERO);
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    Z r = mAll.next().subtract(mF.factorial(n));
    for (int k = 1; k <= n - 3; ++k) {
      final Z t = Binomial.binomial(n, k).square().multiply(mF.factorial(k)).multiply(get(n - k));
      r = r.subtract(t);
    }
    return r;
  }
}
