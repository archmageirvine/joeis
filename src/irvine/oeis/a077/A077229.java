package irvine.oeis.a077;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077193.
 * @author Sean A. Irvine
 */
public class A077229 extends Sequence1 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, -1);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z res = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      res = res.add(RING.pow(RING.series(RING.oneMinusXToTheN(k), C, mN), k, mN).coeff(mN - k));
    }
    return res;
  }
}
