package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001798 Coefficients of Legendre polynomials.
 * @author Sean A. Irvine
 */
public class A001798 extends Sequence1 {

  private int mN = 1;

  @Override
  public Z next() {
    mN += 2;
    final Z m = new Q(Binomial.binomial(2 * mN, mN), Z.ONE.shiftLeft(2 * mN)).num();
    return m.multiply(7).multiply(mN - 1).divide(mN + 2).divide(mN + 4);
  }
}
