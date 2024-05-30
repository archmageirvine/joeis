package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015656 Number of ordered 5-tuples of integers from [ 1,n ] with no common factors among triples.
 * @author Sean A. Irvine
 */
public class A015656 extends AbstractSequence {

  /**
   * Constructor with offset.
   * @param offset first index
   */
  protected A015656(final int offset) {
    super(offset);
  }

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
      final long e = Functions.GCD.l(a, n);
      for (long b = a; b <= n; ++b) {
        if (Functions.GCD.l(e, b) == 1) {
          final long f = Functions.GCD.l(a, b);
          for (long c = b; c <= n; ++c) {
            if (Functions.GCD.l(e, c) == 1 && Functions.GCD.l(f, c) == 1 && Functions.GCD.l(n, b, c) == 1) {
              for (long d = c; d <= n; ++d) {
                if (Functions.GCD.l(e, d) == 1 && Functions.GCD.l(f, d) == 1 && Functions.GCD.l(n, b, d) == 1 && Functions.GCD.l(n, c, d) == 1 && Functions.GCD.l(a, c, d) == 1 && Functions.GCD.l(b, c, d) == 1) {
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
