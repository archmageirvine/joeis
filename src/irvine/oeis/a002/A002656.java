package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.polynomial.Polynomial;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.IntegerField;

/**
 * A002656 Expansion of (eta(q) * eta(q^7))^3 in powers of q.
 * @author Sean A. Irvine
 */
public class A002656 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN; ++k) {
      p = RING.multiply(p, RING.multiply(RING.oneMinusXToTheN(k), RING.oneMinusXToTheN(7 * k), mN), mN);
    }
    return RING.pow(p, 3, mN).coeff(mN);
  }
}
