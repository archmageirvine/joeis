package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001797 Coefficients of Legendre polynomials.
 * @author Sean A. Irvine
 */
public class A001797 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final Z m = new Q(Binomial.binomial(2 * mN, mN), Z.ONE.shiftLeft(2 * mN)).num();
    return m.multiply(5).multiply(mN).divide(mN + 1).divide(mN + 3);
  }
}
