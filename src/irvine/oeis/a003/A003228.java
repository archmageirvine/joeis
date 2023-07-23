package irvine.oeis.a003;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a055.A055290;

/**
 * A003228 Endpoints in trees with n nodes.
 * @author Sean A. Irvine
 */
public class A003228 extends A055290 {

  {
    setOffset(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    ++mN;
    final Polynomial<Q> gf = gf(mN).coeff(mN);
    for (int k = 1; k <= mN; ++k) {
      s = s.add(gf.coeff(k).toZ().multiply(k));
    }
    return s;
  }
}
