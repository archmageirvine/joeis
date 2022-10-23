package irvine.oeis.a052;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052851 Expansion of e.g.f. 1/2 - (1/2)*(1+4*log(1-x))^(1/2).
 * @author Sean A. Irvine
 */
public class A052851 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z kf = Z.ONE;
    for (int k = 1; k <= mN; ++k) {
      kf = kf.multiply(k);
      sum = sum.signedAdd(((mN + k) & 1) == 0, Stirling.firstKind(mN, k).multiply(kf).multiply(Binomial.binomial(2L * k - 2, k - 1)).divide(k));
    }
    return sum;
  }
}
