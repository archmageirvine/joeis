package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015632 Number of ordered triples of integers from [ 1,n ] with no common factors between pairs.
 * @author Sean A. Irvine
 */
public class A015632 implements Sequence {

  private long mN = start() - 1;
  private Z mA = Z.ZERO;

  protected long start() {
    return 1;
  }

  private long count(final long n) {
    long count = 0;
    for (long a = start(); a <= n; ++a) {
      if (LongUtils.gcd(a, n) == 1) {
        for (long b = a; b <= n; ++b) {
          if (LongUtils.gcd(b, a) == 1 && LongUtils.gcd(b, n) == 1) {
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
