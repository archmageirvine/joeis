package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A015633 Number of ordered triples of integers from [ 2,n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015633 extends Sequence2 {

  private long mN = start() - 1;
  private Z mA = Z.ZERO;

  protected long start() {
    return 2;
  }

  private long count(final long n) {
    long count = 0;
    for (long a = start(); a <= n; ++a) {
      final long d = Functions.GCD.l(a, n);
      for (long b = a; b <= n; ++b) {
        if (Functions.GCD.l(d, b) == 1) {
            ++count;
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
