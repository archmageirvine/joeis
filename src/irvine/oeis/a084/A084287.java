package irvine.oeis.a084;

import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicIntArray;

/**
 * A084287 Self-similar table, read by antidiagonals, where the k-th row is the product of the k-th prime with the antidiagonals of the first k rows of the table.
 * @author Sean A. Irvine
 */
public class A084287 extends Sequence1 {

  private int mN = -1;
  private int mM = 0;
  private final DynamicIntArray mRow = new DynamicIntArray();
  private final DynamicIntArray mCol = new DynamicIntArray();
  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 0) {
        return m == 0 ? Z.ONE : get(n, m - 1).multiply2();
      }
      final long p = Functions.PRIME.l(n + 1);
      final int row = mRow.get(n);
      final int col = mCol.get(n);
      if (mRow.increment(n) > n || col - row <= 0) {
        mRow.set(n, 0);
        mCol.increment(n);
      }
      return get(row, col - row).multiply(p);
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mB.get(mM, mN - mM);
  }
}

