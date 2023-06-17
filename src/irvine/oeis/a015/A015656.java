package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015656 Number of ordered 5-tuples of integers from [ 1,n ] with no common factors among triples.
 * @author Sean A. Irvine
 */
public class A015656 extends AbstractSequence {

  /** Construct the sequence. */
  public A015656() {
    super(1);
  }

  private long mN = start() - 1;
  private Z mA = Z.ZERO;

  protected long start() {
    return 1;
  }

  private long count(final long n) {
    long count = 0;
    for (long a = start(); a <= n; ++a) {
      final long e = LongUtils.gcd(a, n);
      for (long b = a; b <= n; ++b) {
        if (LongUtils.gcd(e, b) == 1) {
          final long f = LongUtils.gcd(a, b);
          for (long c = b; c <= n; ++c) {
            if (LongUtils.gcd(e, c) == 1 && LongUtils.gcd(f, c) == 1 && LongUtils.gcd(n, b, c) == 1) {
              for (long d = c; d <= n; ++d) {
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
