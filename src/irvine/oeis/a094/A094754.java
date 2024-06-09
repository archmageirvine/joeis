package irvine.oeis.a094;

import irvine.math.cyclotomic.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A094754 Middle coefficient of cyclotomic polynomial Phi_n(x).
 * @author Georg Fischer
 */
public class A094754 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mN <= 2) {
      return Z.ZERO;
    }
    final Polynomial<Z> p = CyclotomicPolynomials.cyclotomic(mN);
    return p.coeff(p.degree() / 2);
  }
}
