package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000248 Expansion of e.g.f. <code>exp(x*exp(x))</code>.
 * @author Sean A. Irvine
 */
public class A000248 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).multiply(Z.valueOf(mN - k).pow(k)));
    }
    return sum;
  }
}

