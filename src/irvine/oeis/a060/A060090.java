package irvine.oeis.a060;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A060090 Number of ordered bicoverings of an unlabeled n-set.
 * @author Sean A. Irvine
 */
public class A060090 extends A060092 {

  private int mN = -1;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Polynomial<Polynomial<Q>> egf = egf(mN + mN / 2, mN);
    return Integers.SINGLETON.sum(3, mN + mN / 2, k -> egf.coeff(k).coeff(mN).multiply(F.factorial(k)).toZ());
  }
}
