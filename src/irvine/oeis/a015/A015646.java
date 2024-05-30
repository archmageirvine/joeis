package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015646 Number of 5-tuples of different integers from [ 1,n ] with no common factors among triples.
 * @author Sean A. Irvine
 */
public class A015646 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A015646(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A015646() {
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
        if (Functions.GCD.l(e, b) == 1) {
          final long f = Functions.GCD.l(a, b);
          for (long c = b + 1; c < n - 1; ++c) {
            if (Functions.GCD.l(e, c) == 1 && Functions.GCD.l(f, c) == 1 && LongUtils.gcd(n, b, c) == 1) {
              for (long d = c + 1; d < n; ++d) {
                if (Functions.GCD.l(e, d) == 1 && Functions.GCD.l(f, d) == 1 && LongUtils.gcd(n, b, d) == 1 && LongUtils.gcd(n, c, d) == 1 && LongUtils.gcd(a, c, d) == 1 && LongUtils.gcd(b, c, d) == 1) {
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
