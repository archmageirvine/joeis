package irvine.oeis.a065;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065174 Permutation of Z, folded to N, corresponding to the site swap pattern ...242824202428242... (A065176).
 * @author Sean A. Irvine
 */
public class A065174 extends Sequence1 {

  private long mN = 0;

  private long tz2(final long n) {
    if (n == 0) {
      return 0;
    }
    long s = 1;
    long m = n;
    while ((m & 1) == 0) {
      m >>>= 1;
      ++s;
    }
    return 1L << s;
  }

  @Override
  public Z next() {
    final long n = ++mN;
    return Z.valueOf(LongUtils.z2n(LongUtils.n2z(n) + tz2(Math.abs(LongUtils.n2z(mN)))));
  }
}
