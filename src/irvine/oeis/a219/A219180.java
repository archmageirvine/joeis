package irvine.oeis.a219;

import java.util.Arrays;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A219180 Number T(n,k) of partitions of n into k distinct prime parts; triangle T(n,k), n&gt;=0, read by rows.
 * @author Sean A. Irvine
 */
public class A219180 extends MemoryFunction2Sequence<Integer, Z[]> {

  // After Alois P. Heinz

  private static final Z[] EMPTY = new Z[0];
  private final Fast mFast = new Fast();
  private Z[] mRow = EMPTY;
  private int mN = -1;
  private int mPos = 0;
  private int mPi = 0;

  private Z get(final Z[] a, final int k) {
    return k < 0 || k >= a.length ? Z.ZERO : a[k];
  }

  @Override
  protected Z[] compute(final Integer n, final Integer i) {
    if (n == 0) {
      return new Z[] {Z.ONE};
    }
    if (i < 0) {
      return EMPTY;
    }
    final Z[] b = get(n, i - 1);
    final Z[] c = Functions.PRIME.l(i + 1) > n ? EMPTY : get(n - Functions.PRIME.i(i + 1), i - 1);
    final Z[] res = new Z[Math.max(b.length, c.length + 1)];
    for (int k = 0; k < res.length; ++k) {
      res[k] = get(b, k).add(get(c, k - 1));
    }
    return res;
  }

  protected Z[] nextRow() {
    if (mFast.isPrime(++mN)) {
      ++mPi;
    }
    final Z[] row = get(mN, mPi);
    int k = row.length;
    while (--k >= 0 && row[k].isZero()) {
      // do nothing
    }
    return k != row.length - 1 ? Arrays.copyOf(row, k + 1) : row;
  }

  @Override
  public Z next() {
    while (mPos >= mRow.length) {
      mRow = nextRow();
      mPos = 0;
    }
    return mRow[mPos++];
  }
}
