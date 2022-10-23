package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A015620 Number of triples of different integers from [ 2,n ] with no common factors between pairs.
 * @author Sean A. Irvine
 */
public class A015620 extends Sequence2 {

  private long mN = 1;
  private Z mA = Z.ZERO;

  private long count(final long n) {
    long count = 0;
    for (long a = 2; a < n - 1; ++a) {
      if (LongUtils.gcd(a, n) == 1) {
        for (long b = a + 1; b < n; ++b) {
          if (LongUtils.gcd(a, b) == 1 && LongUtils.gcd(b, n) == 1) {
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
