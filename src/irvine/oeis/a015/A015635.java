package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015635 Number of ordered quadruples of integers from [ 1,n ] with no common factors between triples.
 * @author Sean A. Irvine
 */
public class A015635 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A015635(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A015635() {
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
      final long d = Functions.GCD.l(a, n);
      for (long b = a; b <= n; ++b) {
        final long e = Functions.GCD.l(a, b);
        if (Functions.GCD.l(d, e) == 1) {
          for (long c = b; c <= n; ++c) {
            final long f = Functions.GCD.l(b, c);
            if (Functions.GCD.l(e, f) == 1 && Functions.GCD.l(d, c) == 1 && Functions.GCD.l(f, n) == 1) {
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
