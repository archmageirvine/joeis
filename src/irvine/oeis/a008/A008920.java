package irvine.oeis.a008;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008920 Let j = | i - i_written_backwards |, k = j + j_written_backwards; then k is in this sequence.
 * @author Sean A. Irvine
 */
public class A008920 extends Sequence1 {

  private final TreeSet<Long> mValues = new TreeSet<>();
  private long mN = -1;

  private boolean isReversibleSum(final long n) {
    for (long k = 0; k <= n * n; ++k) {
      if (n == Math.abs(k - Functions.REVERSE.l(k))) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (mValues.isEmpty() || mN < mValues.first()) {
      ++mN;
      if (isReversibleSum(mN)) {
        mValues.add(mN + Functions.REVERSE.l(mN));
      }
    }
    return Z.valueOf(mValues.pollFirst());
  }
}
