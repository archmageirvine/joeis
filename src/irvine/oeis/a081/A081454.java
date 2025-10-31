package irvine.oeis.a081;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081454 Triangle read by rows in which the n-th row contains n distinct numbers whose product is a square, which is minimal over all choices for n distinct numbers.
 * @author Sean A. Irvine
 */
public class A081454 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  protected long[] mRow = {};
  private Z mMin = null;

  private void search(final long[] row, final Z prod, final int pos) {
    if (pos >= row.length) {
      if ((mMin == null || prod.compareTo(mMin) <= 0) && Predicates.SQUARE.is(prod)) {
        mMin = prod;
        mRow = Arrays.copyOf(row, row.length);
      }
      return; // We are done
    }
    long k = row[pos - 1];
    while (true) {
      final Z p = prod.multiply(++k);
      if (mMin != null) {
        if (p.compareTo(mMin) > 0) {
          break;
        }
        // Take account of the smallest possible product of extension
        final int remaining = row.length - (pos + 1);
        if (remaining > 1) {
          final Z q = p.multiply(Functions.FACTORIAL.z(k + remaining).divide(Functions.FACTORIAL.z(k)));
          if (q.compareTo(mMin) > 0) {
            break;
          }
        }
      }
      row[pos] = k;
      search(row, p, pos + 1);
    }
  }

  protected void step() {
    mM = 0;
    final long[] row = new long[++mN];
    row[0] = 1;
    mMin = null;
    search(row, Z.ONE, 1);
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      step();
    }
    return Z.valueOf(mRow[mM]);
  }
}
