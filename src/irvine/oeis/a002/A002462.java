package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002462 Coefficients of Legendre polynomials.
 * @author Sean A. Irvine
 */
public class A002462 extends Sequence0 {

  // Method of Ruperto Corso

  private int mN = -1;

  static Q f(final int n, final int q) {
    return new Q(Binomial.binomial(2L * (n - q), n - q).multiply(Binomial.binomial(2L * q, q)), Z.ONE.shiftLeft(2 * n));
  }

  @Override
  public Z next() {
    ++mN;
    final Q r = f(2 * mN, mN);
    Z lcm = r.den();
    for (int k = 0; k < mN; ++k) {
      lcm = lcm.lcm(f(2 * mN, k).multiply(2).den());
    }
    return r.multiply(lcm).toZ();
  }
}
