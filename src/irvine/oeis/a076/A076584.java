package irvine.oeis.a076;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076584 Let P(n,x) = Product_{k=1..n} polcyclo(k,x) where polcyclo(k,x) denotes the k-th cyclotomic polynomial. Sequence gives the maximum value of coefficients of P(n,x).
 * @author Sean A. Irvine
 */
public class A076584 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mProd = RING.one();
  private int mN = 0;

  @Override
  public Z next() {
    mProd = RING.multiply(mProd, CyclotomicPolynomials.cyclotomic(++mN));
    Z max = Z.ZERO;
    for (final Z v : mProd) {
      max = max.max(v);
    }
    return max;
  }
}
