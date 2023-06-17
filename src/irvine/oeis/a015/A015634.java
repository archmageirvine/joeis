package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015634 Number of ordered quadruples of integers from [ 1..n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015634 extends AbstractSequence {

  /** Construct the sequence. */
  public A015634() {
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
      final long d = LongUtils.gcd(a, n);
      for (long b = a; b <= n; ++b) {
        final long e = LongUtils.gcd(d, b);
        for (long c = b; c <= n; ++c) {
          if (LongUtils.gcd(e, c) == 1) {
            ++count;
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
