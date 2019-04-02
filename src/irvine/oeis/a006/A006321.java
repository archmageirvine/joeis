package irvine.oeis.a006;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006321 Royal paths in a lattice.
 * @author Sean A. Irvine
 */
public class A006321 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Binomial.binomial(mN + 3 + k, mN - 1)));
    }
    return sum.multiply(4).divide(mN);
  }
}

