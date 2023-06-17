package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015653 Number of ordered 5-tuples of integers from [ 1,n ] with no common factors among quadruples.
 * @author Sean A. Irvine
 */
public class A015653 extends AbstractSequence {

  /** Construct the sequence. */
  public A015653() {
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
        final long f = LongUtils.gcd(a, b);
        for (long c = b; c <= n; ++c) {
          final long g = LongUtils.gcd(b, c);
          if (LongUtils.gcd(g, e) == 1) { // (a,b,c,n) != 1
            for (long d = c; d <= n; ++d) {
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
