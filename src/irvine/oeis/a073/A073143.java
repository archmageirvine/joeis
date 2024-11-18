package irvine.oeis.a073;

import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073143 Numbers k such that A073142(n) = f^k(A073142(n)), where f: m -&gt; |m - reverse(m)|.
 * @author Sean A. Irvine
 */
public class A073143 extends Sequence1 {

  private final Set<Long> mReported = new HashSet<>();
  private long mN = -1;

  private long count(final long n) {
    long cnt = 0;
    long m = n;
    final long t = n / 10;
    final Set<Long> seen = new HashSet<>();
    do {
      ++cnt;
      m = Math.abs(m - Functions.REVERSE.l(m));
      if (m == n) {
        return cnt;
      }
      if (m <= t) {
        return -1;
      }
    } while (m != 0 && seen.add(m));
    return -1;
  }

  @Override
  public Z next() {
    while (true) {
      final long count = count(++mN);
      if (count >= 0 && mReported.add(count)) {
        return Z.valueOf(count);
      }
    }
  }
}
