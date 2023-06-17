package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015650 Number of ordered 5-tuples of integers from [ 1..n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015650 extends AbstractSequence {

  /* Construct the sequence. */
  public A015650() {
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
        final long f = LongUtils.gcd(e, b);
        for (long c = b; c <= n; ++c) {
          final long g = LongUtils.gcd(f, c);
          for (long d = c; d <= n; ++d) {
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
