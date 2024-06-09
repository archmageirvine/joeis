package irvine.oeis.a086;

import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086823 Coefficient of x^2 in the n-th cyclotomic polynomial. (The same as the coefficient of x^(phi(n)-2) ).
 * @author Georg Fischer
 */
public class A086823 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Polynomial<Z> p = CyclotomicPolynomials.cyclotomic(++mN);
    return p.coeff(2);
  }
}
