package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006921 Diagonals of Pascal's triangle mod 2 interpreted as binary numbers.
 * @author Sean A. Irvine
 */
public class A006921 extends Sequence0 {

  private static long binomialMod2(final long n, final long r) {
    if (r == 0) {
      return 1;
    }
    final long nr = n & 1;
    final long rr = r & 1;
    if (nr == 0 && rr == 1) {
      return 0;
    }
    return binomialMod2(n >>> 1, r >>> 1);
  }

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z res = Z.ZERO;
    for (long r = 0; r <= mN / 2; ++r) {
      res = res.multiply2().add(binomialMod2(mN - r, r));
    }
    return res;
  }
}
