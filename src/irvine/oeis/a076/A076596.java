package irvine.oeis.a076;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076596 Triangle read by rows: n-th row contains n numbers whose product is a square; all numbers in the triangle are distinct and the square is as small as possible.
 * @author Sean A. Irvine
 */
public class A076596 extends Sequence1 {

  // Method used here is to test each square sequentially and test if it can be constructed
  // from a product of previously unused numbers.

  private final HashSet<Z> mUsed = new HashSet<>();
  private Z[] mRow = {};
  private int mM = 0;
  private long mR = 0;

  private boolean solve(final Z[] d, final Z remaining, final int pos, final int k) {
    if (k == mRow.length) {
      return Z.ONE.equals(remaining);
    }
    for (int j = pos; j < d.length && d[j].compareTo(remaining) <= 0; ++j) {
      final Z[] qr = remaining.divideAndRemainder(d[j]);
      if (qr[1].isZero()) {
        mRow[k] = d[j];
        if (solve(d, qr[0], j + 1, k + 1)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = new Z[mRow.length + 1];
      while (true) {
        final TreeSet<Z> prunedDivisors = new TreeSet<>();
        for (final Z d : Jaguar.factor(++mR).square().divisors()) {
          if (!mUsed.contains(d)) {
            prunedDivisors.add(d);
          }
        }
        if (prunedDivisors.size() >= mRow.length) {
          final Z[] d = prunedDivisors.toArray(new Z[0]);
          if (solve(d, d[d.length - 1], 0, 0)) {
            mUsed.addAll(Arrays.asList(mRow));
            break;
          }
        }
      }
      mM = 0;
    }
    return mRow[mM];
  }
}
