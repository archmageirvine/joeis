package irvine.oeis.a066;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A066858 Smallest k&gt;1 such that for each integer x, x^k=x or x^k=0 (mod n); or 0 if no such k exists.
 * @author Sean A. Irvine
 */
public class A066858 extends Sequence2 {

  private long mN = 1;

  private boolean is(final long k, final long n) {
    for (long x = 2; x < n; ++x) {
      final long y = LongUtils.modPow(x, k, n);
      if (y != 0 && y != x) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    for (long k = 2; k <= mN; ++k) {
      if (is(k, mN)) {
        return Z.valueOf(k);
      }
    }
    return Z.ZERO;
  }
}
