package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A001799 Coefficient of P_4(x) in the Legendre expansion of x^n.
 * @author Sean A. Irvine
 */
public class A001799 extends Sequence2 {

  private int mN = 2;

  @Override
  public Z next() {
    mN += 2;
    final Z m = new Q(Binomial.binomial(2L * mN, mN), Z.ONE.shiftLeft(2L * mN)).num();
    return m.multiply(9).multiply(mN).multiply(mN - 2).divide(mN + 1).divide(mN + 3).divide(mN + 5);
  }
}
