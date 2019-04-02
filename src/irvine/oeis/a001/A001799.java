package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001799 Coefficients of Legendre polynomials.
 * @author Sean A. Irvine
 */
public class A001799 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    mN += 2;
    final Z m = new Q(Binomial.binomial(2 * mN, mN), Z.ONE.shiftLeft(2 * mN)).num();
    return m.multiply(9).multiply(mN).multiply(mN - 2).divide(mN + 1).divide(mN + 3).divide(mN + 5);
  }
}
