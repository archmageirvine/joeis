package irvine.oeis.a389;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A389886 Number of proper 3-partitions of the vertices of the fan graph on n vertices such that every triangle uses exactly 2 colors.
 * @author Sean A. Irvine
 */
public class A389886 extends Sequence3 {

  private int mN = 1;

  private Z binomial(final int m, final int t) {
    return m < 0 || t < 0 ? Z.ZERO : Binomial.binomial(m, t);
  }

  private Z t(final int m, final int t) {
    return binomial(m - t, t - 1).add(binomial(m - t - 1, t - 1).multiply2()).add(binomial(m - t - 2, t - 1));
  }

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(2, ++mN, k -> t(mN, k).multiply(Z.ONE.shiftLeft(k - 1).subtract(1)));
  }
}

