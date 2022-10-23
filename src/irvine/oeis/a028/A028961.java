package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A028961 Theta series of quadratic form (or lattice) with Gram matrix [ 3, 1; 1, 8 ].
 * @author Sean A. Irvine
 */
public class A028961 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    for (long y = 0; y * y <= mN; ++y) {
      final long t = mN - 8 * y * y;
      final long d = 12 * t + 4 * y * y;
      if (d >= 0) {
        final long s = LongUtils.sqrt(d);
        if (s * s == d) {
          if ((-2 * y + s) % 6 == 0) {
            cnt += y == 0 ? 1 : 2;
          }
          if (s != 0 && (-2 * y - s) % 6 == 0) {
            cnt += y == 0 ? 1 : 2;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
