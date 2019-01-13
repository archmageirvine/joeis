package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005285.
 * @author Sean A. Irvine
 */
public class A005285 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> DEN = RING.oneMinusXToTheN(1);
  private int mN = 6;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 2; k <= mN; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(k), mN);
    }
    return RING.coeff(p, RING.pow(DEN, mN - 1), mN - 7);
  }
}

