package irvine.oeis.a065;

import irvine.math.IntegerUtils;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065567 T(n,m) is the sum over all m-subsets of {1,...,n} of the gcd of the subset.
 * @author Sean A. Irvine
 */
public class A065567 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  protected Z t(final int n, final int m) {
    Z sum = Z.ZERO;
    final long lim = 1L << n;
    for (long k = (1L << m) - 1; k < lim; k = LongUtils.swizzle(k)) {
      long j = k;
      int gcd = 0;
      int i = 0;
      while (j != 0 && gcd != 1) {
        ++i;
        if ((j & 1) == 1) {
          gcd = gcd == 0 ? i : IntegerUtils.gcd(gcd, i);
        }
        j >>>= 1;
      }
      sum = sum.add(gcd);
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      if (++mN > 63) {
        throw new UnsupportedOperationException();
      }
      mM = 1;
    }
    return t(mN, mM);
  }
}
