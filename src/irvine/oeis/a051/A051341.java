package irvine.oeis.a051;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051341 A simple 2-dimensional array, read by antidiagonals.
 * @author Sean A. Irvine
 */
public class A051341 implements Sequence {

  // Example 5.2 in A. V. Mikhalev and A. A. Nechaev

  private long mN = -1;
  private long mM = 0;

  private Z t(final long n, final long m) {
    if (n == 0) {
      final long t = 8 * m + 9;
      final long s = LongUtils.sqrt(t);
      return s * s == t ? Z.ONE : Z.ZERO;
    }
    return ((n + m) & 1) == 0 ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM);
  }
}
