package irvine.oeis.a074;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074746 Number of distinct differences between consecutive anti-divisors of n (ordered by size).
 * @author Sean A. Irvine
 */
public class A074746 extends Sequence1 {

  private long mN = 0;

  static boolean isAntidivisor(final long d, final long n) {
    if (n % d == 0) {
      return false;
    }
    if ((d & 1) == 1) {
      return (2 * n + 1) % d == 0 || (2 * n - 1) % d == 0;
    } else {
      return (2 * n) % d == 0;
    }
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<Long> diffs = new HashSet<>();
    long k = 0;
    for (long d = 2; d < mN; ++d) {
      if (isAntidivisor(d, mN)) {
        if (k != 0) {
          diffs.add(d - k);
        }
        k = d;
      }
    }
    return Z.valueOf(diffs.size());
  }
}
