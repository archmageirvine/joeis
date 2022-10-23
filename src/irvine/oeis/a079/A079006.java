package irvine.oeis.a079;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079006 Expansion of q^(-1/4) * (eta(q) * eta(q^4)^2 / eta(q^2)^3)^2 in powers of q.
 * @author Sean A. Irvine
 */
public class A079006 extends Sequence0 {

  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> num = RING.one();
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= mN; k += 2) {
      num = RING.multiply(num, RING.onePlusXToTheN(k + 1));
      den = RING.multiply(den, RING.onePlusXToTheN(k));
    }
    return RING.pow(RING.series(num, den, mN), 2, mN).coeff(mN);
  }
}
