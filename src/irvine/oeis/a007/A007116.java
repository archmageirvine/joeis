package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007116 Expansion of e.g.f. (1+x)^(exp(x)).
 * @author Sean A. Irvine
 */
public class A007116 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      Z kk = Z.ONE;
      for (int i = 0; i <= mN - k; ++i, kk = kk.multiply(k)) {
        sum = sum.add(Binomial.binomial(mN, i).multiply(kk).multiply(Stirling.firstKind(mN - i, k)));
      }
    }
    return sum;
  }
}
