package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000339 Number of partitions into non-integral powers.
 * @author Sean A. Irvine
 */
public class A000339 implements Sequence {

  // Method of R. J. Mathar

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z a = Z.ZERO;
    final long sq = mN * mN;
    for (long x1 = 1; x1 <= sq; ++x1) {
      final double xr = mN - Math.sqrt(x1);
      final double x2 = xr * xr;
      if (Math.floor(x2) >= x1) {
        a = a.add((long) Math.floor(x2 - x1 + 1));
      }
    }
    return a;
  }
}
