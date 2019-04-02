package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015640 Number of 5-tuples of different integers from [ 1,n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015640 implements Sequence {

  private long mN = start() - 1;
  private Z mA = Z.ZERO;

  protected long start() {
    return 1;
  }

  private long count(final long n) {
    long count = 0;
    for (long a = start(); a < n - 3; ++a) {
      final long e = LongUtils.gcd(a, n);
      for (long b = a + 1; b < n - 2; ++b) {
        final long f = LongUtils.gcd(e, b);
        for (long c = b + 1; c < n - 1; ++c) {
          final long g = LongUtils.gcd(f, c);
          for (long d = c + 1; d < n; ++d) {
            if (LongUtils.gcd(g, d) == 1) {
              ++count;
            }
          }
        }
      }
    }
    return count;
  }

  @Override
  public Z next() {
    mA = mA.add(count(++mN));
    return mA;
  }
}
