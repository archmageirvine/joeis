package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015646 Number of 5-tuples of different integers from [ 1,n ] with no common factors among triples.
 * @author Sean A. Irvine
 */
public class A015646 implements Sequence {

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
        if (LongUtils.gcd(e, b) == 1) {
          final long f = LongUtils.gcd(a, b);
          for (long c = b + 1; c < n - 1; ++c) {
            if (LongUtils.gcd(e, c) == 1 && LongUtils.gcd(f, c) == 1 && LongUtils.gcd(n, b, c) == 1) {
              for (long d = c + 1; d < n; ++d) {
                if (LongUtils.gcd(e, d) == 1 && LongUtils.gcd(f, d) == 1 && LongUtils.gcd(n, b, d) == 1 && LongUtils.gcd(n, c, d) == 1 && LongUtils.gcd(a, c, d) == 1 && LongUtils.gcd(b, c, d) == 1) {
                  ++count;
                }
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
