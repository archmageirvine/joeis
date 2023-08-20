package irvine.oeis.a060;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060502 a(n) = number of occupied digit slopes in the factorial base representation of n (see comments for the definition); number of drops in the n-th permutation of list A060117.
 * @author Sean A. Irvine
 */
public class A060502 extends Sequence0 {

  private int mN = -1;

  private Z avg(final int[] s) {
    Z z = Z.ZERO;
    for (int j = s.length - 1; j >= 0; --j) {
      if (s[j] > 0) {
        z = z.add(s.length - s[j]);
      }
    }
    return z.divide(s.length);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return avg(IntegerPermutation.permUnrank3R(mN).toSiteSwap());
  }
}
