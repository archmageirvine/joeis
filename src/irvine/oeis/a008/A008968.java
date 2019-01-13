package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008968.
 * @author Sean A. Irvine
 */
public class A008968 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -1, 0, 1, 1, -1);
  private Polynomial<Z> mG = null;
  private int mN = 3;
  private int mM = 10;

  @Override
  public Z next() {
    if (++mM >= 3 * mN - 2) {
      mM = 0;
      ++mN;
      mG = RING.series(RING.multiply(RING.multiply(RING.oneMinusXToTheN(mN), RING.oneMinusXToTheN(mN + 1)), RING.oneMinusXToTheN(mN + 2)), DEN, 3 * mN - 2);
    }
    return mG.coeff(mM);
  }
}

