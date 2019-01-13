package irvine.oeis.a015;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015633.
 * @author Sean A. Irvine
 */
public class A015633 implements Sequence {

  private long mN = start() - 1;
  private Z mA = Z.ZERO;

  protected long start() {
    return 2;
  }

  private long count(final long n) {
    long count = 0;
    for (long a = start(); a <= n; ++a) {
      final long d = LongUtils.gcd(a, n);
      for (long b = a; b <= n; ++b) {
        if (LongUtils.gcd(d, b) == 1) {
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
