package irvine.oeis.a035;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A035607 Table a(d,m) of number of points of L1 norm m in cubic lattice Z^d, read by antidiagonals (d &gt;= 1, m &gt;= 0).
 * @author Sean A. Irvine
 */
public class A035607 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  private Z f(final int d, final int m) {
    Z sum = Z.ZERO;
    for (int j = 0; j < d; ++j) {
      sum = sum.add(Binomial.binomial((d - 1 + j) / 2, d - m - 1).multiply(Binomial.binomial(d - m - 1, (d - 1 - j) / 2)));
    }
    return sum;
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return f(mN, mM);
  }
}

