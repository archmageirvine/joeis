package irvine.oeis.a080;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080242 Table of coefficients of polynomials P(n,x) defined by the relation P(n,x) = (1+x)*P(n-1,x) + (-x)^(n+1).
 * @author Sean A. Irvine
 */
public class A080242 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mRow = Polynomial.create(1);
  private int mM = -1;
  private int mN = 1;

  @Override
  public Z next() {
    if (++mM > mRow.degree()) {
      ++mN;
      mM = 0;
      mRow = RING.add(RING.multiply(mRow, RING.onePlusXToTheN(1)), RING.monomial(Z.NEG_ONE.pow(mN), mN));
    }
    return mRow.coeff(mM);
  }
}

