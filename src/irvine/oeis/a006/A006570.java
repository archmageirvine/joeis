package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006570 From trees with valency <code>&lt;= 3</code>.
 * @author Sean A. Irvine
 */
public class A006570 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Polynomial<Z> mA = RING.x();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Z> t = RING.subtract(RING.x(), RING.multiply(RING.oneMinusXToTheN(1), mA, mN));
    final Polynomial<Z> u = RING.divide(RING.multiply(RING.onePlusXToTheN(1), RING.add(RING.pow(mA, 2, mN), mA.substitutePower(2, mN)), mN), Z.TWO);
    mA = RING.add(mA, RING.add(t, u));
    return mA.coeff(mN);
  }
}
