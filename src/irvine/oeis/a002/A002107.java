package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002107 Expansion of Product_{k&gt;=1} (1 - x^k)^2.
 * @author Sean A. Irvine
 */
public class A002107 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(k), mN);
    }
    return RING.pow(p, 2, mN).coeff(mN);
  }
}
