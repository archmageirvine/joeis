package irvine.oeis.a055;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A055525 Shortest other side of a Pythagorean triangle having n as length of one of the three sides.
 * @author Sean A. Irvine
 */
public class A055525 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    final long s = ++mN * mN;
    long k = 2;
    while (true) {
      final long k2 = ++k * k;
      final long a = s + k2;
      final long as = LongUtils.sqrt(a);
      if (as * as == a) {
        return Z.valueOf(k);
      }
      final long b = s - k2;
      if (b > 0) {
        final long bs = LongUtils.sqrt(b);
        if (bs * bs == b) {
          return Z.valueOf(k);
        }
      }
    }
  }
}
