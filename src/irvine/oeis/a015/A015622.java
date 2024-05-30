package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015622 Quadruples of different integers from [ 1,n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015622 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A015622(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A015622() {
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
      final long d = Functions.GCD.l(a, n);
      for (long b = a + 1; b < n - 1; ++b) {
        final long e = Functions.GCD.l(d, b);
        for (long c = b + 1; c < n; ++c) {
          if (Functions.GCD.l(e, c) == 1) {
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
