package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015632 Number of ordered triples of integers from [ 1,n ] with no common factors between pairs.
 * @author Sean A. Irvine
 */
public class A015632 extends Sequence1 {

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
          if (Functions.GCD.l(b, a) == 1 && Functions.GCD.l(b, n) == 1) {
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
