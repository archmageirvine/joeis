package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015640 Number of 5-tuples of different integers from [ 1,n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015640 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A015640(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A015640() {
    super(1);
  }

  private long mN = start() - 1;
  private Z mA = Z.ZERO;

  protected long start() {
    return 1;
  }

  private long count(final long n) {
    long count = 0;
    for (long a = start(); a < n - 3; ++a) {
      final long e = Functions.GCD.l(a, n);
      for (long b = a + 1; b < n - 2; ++b) {
        final long f = Functions.GCD.l(e, b);
        for (long c = b + 1; c < n - 1; ++c) {
          final long g = Functions.GCD.l(f, c);
          for (long d = c + 1; d < n; ++d) {
            if (Functions.GCD.l(g, d) == 1) {
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
