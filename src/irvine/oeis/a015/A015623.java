package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015623 Quadruples of different integers from [ 1,n ] with no common factors between pairs.
 * @author Sean A. Irvine
 */
public class A015623 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A015623(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A015623() {
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
      if (Functions.GCD.l(a, n) == 1) {
        for (long b = a + 1; b < n - 1; ++b) {
          if (Functions.GCD.l(b, a) == 1 && Functions.GCD.l(b, n) == 1) {
            for (long c = b + 1; c < n; ++c) {
              if (Functions.GCD.l(c, b) == 1 && Functions.GCD.l(c, a) == 1 && Functions.GCD.l(c, n) == 1) {
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
