package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015644 Number of 5-tuples of different integers from <code>[ 1,n ]</code> with no common factors among quadruples.
 * @author Sean A. Irvine
 */
public class A015644 implements Sequence {

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
        final long f = LongUtils.gcd(a, b);
        for (long c = b + 1; c < n - 1; ++c) {
          final long g = LongUtils.gcd(b, c);
          if (LongUtils.gcd(g, e) == 1) { // (a,b,c,n) != 1
            for (long d = c + 1; d < n; ++d) {
              final long h = LongUtils.gcd(c, d);
              if (LongUtils.gcd(e, h) == 1 && LongUtils.gcd(e, b, d) == 1 && LongUtils.gcd(h, b, n) == 1 && LongUtils.gcd(h, f) == 1) {
                ++count;
              }
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
