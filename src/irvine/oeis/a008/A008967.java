package irvine.oeis.a008;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008967.
 * @author Sean A. Irvine
 */
public class A008967 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -1, -1, 1);
  private Polynomial<Z> mG = null;
  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= 2 * mN - 1) {
      mM = 0;
      ++mN;
      mG = RING.series(RING.multiply(RING.oneMinusXToTheN(mN), RING.oneMinusXToTheN(mN + 1)), DEN, 2 * mN - 1);
    }
    return mG.coeff(mM);
  }
}

