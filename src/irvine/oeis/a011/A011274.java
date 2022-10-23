package irvine.oeis.a011;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A011274 Triangle of numbers of hybrid rooted trees (divided by Fibonacci numbers).
 * @author Sean A. Irvine
 */
public class A011274 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN - mM; ++k) {
      sum = sum.add(Binomial.binomial(mN + k - 1, mN - 1).multiply(Binomial.binomial(mN + k, mN - mM - k)));
    }
    return sum.multiply(mM).divide(mN);
  }
}

