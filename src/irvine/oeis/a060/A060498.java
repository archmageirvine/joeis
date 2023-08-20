package irvine.oeis.a060;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060498 Each permutation in the list A060117 converted to Site Swap notation, with digits reversed and inverted. "Zero throws" (fixed elements) indicated with 0's.
 * @author Sean A. Irvine
 */
public class A060498 extends Sequence0 {

  private int mN = -1;

  private Z toZ(final int[] s) {
    Z z = Z.ZERO;
    for (int j = s.length - 1; j >= 0; --j) {
      if (s[j] > 9) {
        throw new UnsupportedOperationException("Invalid: " + mN);
      }
      z = z.multiply(10);
      if (s[j] > 0) {
        z = z.add(s.length - s[j]);
      }
    }
    return z;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return toZ(IntegerPermutation.permUnrank3R(mN).toSiteSwap());
  }
}
