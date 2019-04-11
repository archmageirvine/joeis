package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015625 Quadruples of different integers from <code>[ 1,n ]</code> with no common factors between triples.
 * @author Sean A. Irvine
 */
public class A015625 implements Sequence {

  private long mN = start() - 1;
  private Z mA = Z.ZERO;

  protected long start() {
    return 1;
  }

  private long count(final long n) {
    long count = 0;
    for (long a = start(); a < n - 2; ++a) {
      final long d = LongUtils.gcd(a, n);
      for (long b = a + 1; b < n - 1; ++b) {
        final long e = LongUtils.gcd(a, b);
        if (LongUtils.gcd(d, e) == 1) {
          for (long c = b + 1; c < n; ++c) {
            final long f = LongUtils.gcd(b, c);
            if (LongUtils.gcd(e, f) == 1 && LongUtils.gcd(d, c) == 1 && LongUtils.gcd(f, n) == 1) {
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
