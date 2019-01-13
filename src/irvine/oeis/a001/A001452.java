package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001452.
 * @author Sean A. Irvine
 */
public class A001452 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;
  private Polynomial<Z> mP = RING.one();

  @Override
  public Z next() {
    mP = RING.multiply(mP, RING.pow(RING.oneMinusXToTheN(++mN), Math.min(mN, 5)));
    return RING.coeff(RING.one(), mP, mN);
  }
}
