package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.LongUtils;

/**
 * A002652.
 * @author Sean A. Irvine
 */
public class A002652 implements Sequence {

  private long mN = -1;

  private long isSquare(final long n) {
    final long s = LongUtils.sqrt(n);
    return s * s == n ? 2 : 0;
  }

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (long y = 1; y <= LongUtils.sqrt(4 * mN / 7); ++y) {
      final long t = 4 * mN - 7 * y * y;
      s = s.add(isSquare(t));
      if (t == 0) {
        s = s.subtract(1);
      }
    }
    s = s.multiply2();
    return s.add(isSquare(mN));
  }
}
