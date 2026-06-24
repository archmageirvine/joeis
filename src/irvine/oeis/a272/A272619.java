package irvine.oeis.a272;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A272619 Irregular array read by rows: n-th row contains (in ascending order) the numbers 1 &lt;= k &lt; n such that at least one prime divisor p of k also divides n and at least one prime divisor q of k is coprime to n.
 * @author Sean A. Irvine
 */
public class A272619 extends Sequence1 {

  private static final long[] EMPTY = {0};
  private long mN = 0;
  private int mM = 0;
  private long[] mRow = {};

  /**
   * Construct a row of A272619.
   * @param n row number
   * @return array
   */
  public static long[] row(final long n) {
    final ArrayList<Long> list = new ArrayList<>();
    for (long k = 1; k < n; ++k) {
      boolean okP = false;
      boolean okC = false;
      for (final Z pp : Jaguar.factor(k).toZArray()) {
        final long p = pp.longValue();
        okP |= n % p == 0;
        okC |= n % p != 0;
      }
      if (okP && okC) {
        list.add(k);
      }
    }
    if (list.size() == 0) {
      return EMPTY;
    }
    return LongUtils.toLong(list);
  }

  @Override
  public Z next() {
    if (++mM >= mRow.length) {
      mRow = row(++mN);
      mM = 0;
    }
    return Z.valueOf(mRow[mM]);
  }
}
