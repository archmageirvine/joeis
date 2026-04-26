package irvine.oeis.a084;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084600 Triangle, read by rows, where the n-th row lists the (2n+1) coefficients of (1+x+2x^2)^n for n &gt;= 0.
 * @author Sean A. Irvine
 */
public class A084600 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mP = RING.one();
  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mP.degree()) {
      mP = RING.pow(Polynomial.create(1, 1, 2), ++mN);
      mM = 0;
    }
    return mP.coeff(mM);
  }
}

