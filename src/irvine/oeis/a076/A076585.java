package irvine.oeis.a076;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A076585 Let P(n,x) = Product_{k=1..n} polcyclo(k,x) where polcyclo(k,x) denotes the k-th cyclotomic polynomial. Sequence gives array of coefficients of P(n,x).
 * @author Sean A. Irvine
 */
public class A076585 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mProd = RING.one();
  private int mN = 0;
  private int mM = 1;

  @Override
  public Z next() {
    if (--mM < 0) {
      mProd = RING.multiply(mProd, CyclotomicPolynomials.cyclotomic(++mN));
      mM = mProd.degree();
    }
    return mProd.coeff(mM);
  }
}
