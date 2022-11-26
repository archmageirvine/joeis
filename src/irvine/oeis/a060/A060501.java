package irvine.oeis.a060;

import irvine.math.IntegerUtils;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;

/**
 * A060501 Average of digits of each term in A060495, number of balls in each such siteswap juggling pattern.
 * @author Sean A. Irvine
 */
public class A060501 extends A060117 {

  private int mN = -1;

  // Not quite the same as IntegerPemutation.toSiteSwap
  private int[] toSiteSwap(final IntegerPermutation p) {
    final IntegerPermutation inv = p.inverse();
    final int[] a = new int[p.size()];
    for (int k = 0; k < a.length; ++k) {
      final int b = (inv.image(k) + a.length - k) % a.length;
      a[k] = b == 0 ? a.length : b;
    }
    return a;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final int[] ss = toSiteSwap(permUnrank3R(mN));
    return Z.valueOf(IntegerUtils.sum(ss) / ss.length);
  }
}
