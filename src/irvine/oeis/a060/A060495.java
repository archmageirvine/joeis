package irvine.oeis.a060;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060495 Each permutation in the list A060117 converted to Site Swap notation, with "zero throws" (fixed elements) replaced with n, the length of siteswap.
 * @author Sean A. Irvine
 */
public class A060495 extends Sequence0 {

  private int mN = -1;

  private Z toZ(final int[] s) {
    final int n = s.length;
    Z z = Z.ZERO;
    for (final int k : s) {
      if (k > 9) {
        throw new UnsupportedOperationException("Invalid: " + mN);
      }
      z = z.multiply(10);
      z = z.add(k == 0 ? n : k);
    }
    return z;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return toZ(IntegerPermutation.permUnrank3R(mN).toSiteSwap());
  }
}
