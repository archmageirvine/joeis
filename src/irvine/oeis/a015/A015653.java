package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015653 Number of ordered 5-tuples of integers from [ 1,n ] with no common factors among quadruples.
 * @author Sean A. Irvine
 */
public class A015653 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A015653(final int offset) {
    super(offset);
  }

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
      final long e = Functions.GCD.l(a, n);
      for (long b = a; b <= n; ++b) {
        final long f = Functions.GCD.l(a, b);
        for (long c = b; c <= n; ++c) {
          final long g = Functions.GCD.l(b, c);
          if (Functions.GCD.l(g, e) == 1) { // (a,b,c,n) != 1
            for (long d = c; d <= n; ++d) {
              final long h = Functions.GCD.l(c, d);
              if (Functions.GCD.l(e, h) == 1 && Functions.GCD.l(e, b, d) == 1 && Functions.GCD.l(h, b, n) == 1 && Functions.GCD.l(h, f) == 1) {
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
