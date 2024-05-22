package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A060500 a(n) = number of drops in the n-th permutation of list A060118; the average of digits (where "digits" may eventually obtain also any values &gt; 9) in each siteswap pattern A060496(n).
 * @author Sean A. Irvine
 */
public class A060500 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final int[] ss = IntegerPermutation.permUnrank3R(mN).toSiteSwap();
    return Functions.SUM.z(ss).divide(ss.length);
  }
}
