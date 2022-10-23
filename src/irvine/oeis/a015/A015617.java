package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015617 Number of (unordered) triples of integers from [1,n] with no common factors between pairs.
 * @author Sean A. Irvine
 */
public class A015617 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ZERO;

  private long count(final long n) {
    long count = 0;
    for (long a = 1; a < n - 1; ++a) {
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
