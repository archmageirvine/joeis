package irvine.oeis.a081;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A081616 Sequence of constants appearing in formula for expected number of inversions after a sequence of random adjacent transpositions.
 * @author Sean A. Irvine
 */
public class A081616 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int s = 3; s <= mN; ++s) {
      final int ss = s;
      final Z t = Integers.SINGLETON.sum(0, (ss - 1) / 2, k -> Binomial.binomial(((ss + 1) & ~1) - 1, (ss + 1) / 2 + k).multiply(k));
      sum = sum.add(Z.NEG_ONE.pow(s - 1).multiply(Binomial.binomial(mN - 1, s - 1)).multiply(Binomial.binomial(s & ~1, s / 2)).multiply(t).shiftLeft(2L * (mN - s)));
    }
    return sum.divide2();
  }
}
