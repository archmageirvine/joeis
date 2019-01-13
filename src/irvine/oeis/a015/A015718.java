package irvine.oeis.a015;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A015718.
 * @author Sean A. Irvine
 */
public class A015718 extends A000009 {

  private static final PolynomialRingField<Z> TRING = new PolynomialRingField<>("t", IntegerField.SINGLETON);
  private static final PolynomialRingField<Polynomial<Z>> XRING = new PolynomialRingField<>(TRING);
  private final Polynomial<Polynomial<Z>> mG = XRING.one();
  private Polynomial<Polynomial<Z>> mH = XRING.zero();
  private int mN = 1;
  private int mM = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
      mG.add(TRING.monomial(super.next(), 0));
      Polynomial<Polynomial<Z>> sum = XRING.zero();
      for (int j = 1; j < mN; ++j) {
        sum = XRING.add(sum, XRING.series(XRING.monomial(TRING.monomial(Z.ONE, j), 1), XRING.onePlusXToTheN(j), mN));
      }
      mH = XRING.multiply(mG, sum, mN);
    }
    return mH.coeff(mN).coeff(mM);
  }
}
