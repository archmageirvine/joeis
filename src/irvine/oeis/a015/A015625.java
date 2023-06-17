package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015625 Quadruples of different integers from [ 1,n ] with no common factors between triples.
 * @author Sean A. Irvine
 */
public class A015625 extends AbstractSequence {

  /* Construct the sequence. */
  public A015625() {
    super(1);
  }

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
