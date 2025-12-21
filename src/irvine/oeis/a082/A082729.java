package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A082729 Least positive number that can be written using all divisors of n and the operations add and subtract.
 * @author Sean A. Irvine
 */
public class A082729 extends Sequence1 {

  private long mN = 0;
  private long mMin = 0;

  private void search(final long[] d, final long sum, final int pos) {
    if (pos >= d.length) {
      if (sum != 0) {
        mMin = Math.min(mMin, Math.abs(sum));
      }
      return;
    }
    search(d, sum + d[pos], pos + 1);
    search(d, sum - d[pos], pos + 1);
  }

  @Override
  public Z next() {
    final long[] d = ZUtils.toLong(Jaguar.factor(++mN).divisors());
    mMin = Long.MAX_VALUE;
    search(d, d[0], 1);
    return Z.valueOf(mMin);
  }
}
