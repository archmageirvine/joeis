package irvine.oeis.a012;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A012000 Expansion of 1/sqrt(1 - 4*x + 16*x^2).
 * @author Sean A. Irvine
 */
public class A012000 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    Z t = Z.ONE;
    for (long k = 0; k <= mN; ++k) {
      sum = sum.add(Binomial.binomial(mN, k).square().multiply(t));
      t = t.multiply(-3);
    }
    return (mN & 1) == 0 ? sum : sum.negate();
  }
}
