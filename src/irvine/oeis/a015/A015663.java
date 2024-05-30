package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015663 Number of ordered 5-tuples of integers from [ 1,n ] with no common factors among pairs.
 * @author Sean A. Irvine
 */
public class A015663 extends Sequence1 {

  private long mN = start() - 1;
  private Z mA = Z.ZERO;

  protected long start() {
    return 1;
  }

  private long count(final long n) {
    long count = 0;
    for (long a = start(); a <= n; ++a) {
      if (Functions.GCD.l(a, n) == 1) {
        for (long b = a; b <= n; ++b) {
          if (Functions.GCD.l(a, b) == 1 && Functions.GCD.l(b, n) == 1) {
            for (long c = b; c <= n; ++c) {
              if (Functions.GCD.l(c, b) == 1 && Functions.GCD.l(c, a) == 1 && Functions.GCD.l(c, n) == 1) {
                for (long d = c; d <= n; ++d) {
                  if (Functions.GCD.l(d, c) == 1 && Functions.GCD.l(d, b) == 1 && Functions.GCD.l(d, a) == 1 && Functions.GCD.l(d, n) == 1) {
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
