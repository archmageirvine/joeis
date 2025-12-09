package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A391043 allocated for Michel Eduardo Beleza Yamagishi.
 * @author Sean A. Irvine
 */
public class A391043 extends Sequence2 {

  // After Michel Marcus

  private int mN = 1;
  private long[] mRow = new long[0];
  private int mM = 0;

  private int count(final long k) {
    int j = 0;
    for (long p = 2; p <= k; p = Functions.NEXT_PRIME.l(p)) {
      ++j;
      if (Predicates.PRIME.is(2 * k - p)) {
        break;
      }
    }
    return j;
  }

  private void step() {
    for (int k = 2; k <= mN; ++k) {
      ++mRow[count(k) - 1];
    }
  }

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mRow.length) {
        mRow = new long[++mN];
        step();
        mM = 0;
      }
      if (mRow[mM] != 0) {
        return Z.valueOf(mRow[mM]);
      }
    }
  }
}
