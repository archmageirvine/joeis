package irvine.oeis.a038;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038051 G.f.: B(x/(1-x)) where B is g.f. of A000169.
 * @author Sean A. Irvine
 */
public class A038051 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Z.valueOf(k + 1).pow(k)));
    }
    return sum;
  }
}
