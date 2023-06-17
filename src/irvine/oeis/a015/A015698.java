package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A015698 Number of 5-tuples of different integers from [ 1,n ] with no common factors among pairs.
 * @author Sean A. Irvine
 */
public class A015698 extends AbstractSequence {

  /** Construct the sequence. */
  public A015698() {
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
      if (LongUtils.gcd(a, n) == 1) {
        for (long b = a + 1; b < n - 2; ++b) {
          if (LongUtils.gcd(a, b) == 1 && LongUtils.gcd(b, n) == 1) {
            for (long c = b + 1; c < n - 1; ++c) {
              if (LongUtils.gcd(c, b) == 1 && LongUtils.gcd(c, a) == 1 && LongUtils.gcd(c, n) == 1) {
                for (long d = c + 1; d < n; ++d) {
                  if (LongUtils.gcd(d, c) == 1 && LongUtils.gcd(d, b) == 1 && LongUtils.gcd(d, a) == 1 && LongUtils.gcd(d, n) == 1) {
                    ++count;
                  }
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
