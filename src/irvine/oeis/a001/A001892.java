package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001892.
 * @author Sean A. Irvine
 */
public class A001892 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> POLY = Polynomial.create(1, -1);

  protected int delta() {
    return 1;
  }

  private int mN = delta();
  private Polynomial<Z> mP = RING.pow(POLY, mN);

  @Override
  public Z next() {
    ++mN;
    mP = RING.multiply(mP, POLY);
    Polynomial<Z> p = RING.one();
    for (int j = 1; j <= mN; ++j) {
      p = RING.multiply(p, RING.oneMinusXToTheN(j));
    }
    return RING.coeff(p, mP, mN - 1 - delta());
  }
}
