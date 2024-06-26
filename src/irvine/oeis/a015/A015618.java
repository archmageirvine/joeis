package irvine.oeis.a015;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A015618 Number of triples of different integers from [ 2,n ] with no global factor.
 * @author Sean A. Irvine
 */
public class A015618 extends Sequence2 {

  private long mN = 1;
  private Z mA = Z.ZERO;

  private long count(final long n) {
    long count = 0;
    for (long a = 2; a < n - 1; ++a) {
      final long d = Functions.GCD.l(a, n);
      for (long b = a + 1; b < n; ++b) {
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
