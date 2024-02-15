package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A068348 Number of partitions of A066926(n) into x_i parts.
 * @author Sean A. Irvine
 */
public class A068348 extends Sequence1 {

  private long mN = 0;

  protected long countPartitions(final long n, final long x, final long y, final long[] terms, final int pos) {
    if (pos >= terms.length || x < 0 || y < 0) {
      return 0;
    }
    if (x == 0 && y == 0) {
      return 1;
    }
    return countPartitions(n, x, y, terms, pos + 1)
      + (n % terms[pos] == 0
      ? countPartitions(n, x - terms[pos], y - n / terms[pos], terms, pos)
      : 0);
  }

  @Override
  public Z next() {
    if (mN == 0) {
      ++mN;
      return Z.ONE;
    }
    while (true) {
      ++mN;
      final long cnt = countPartitions(mN, mN, mN, ZUtils.toLong(Jaguar.factor(mN).divisorsSorted()), 0);
      if (cnt > 0) {
        return Z.valueOf(cnt);
      }
    }
  }
}
