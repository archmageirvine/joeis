package irvine.oeis.a022;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022541 Related to number of irreducible stick-cutting problems.
 * @author Sean A. Irvine
 */
public class A022541 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int m = mN * (mN + 1) / 2;
    Polynomial<Z> prod = RING.one();
    for (int k = mN + 1; k <= 2 * mN - 2; ++k) {
      prod = RING.multiply(prod, RING.series(RING.one(), RING.oneMinusXToTheN(k), m), m);
    }
    return prod.coeff(m);
  }
}
