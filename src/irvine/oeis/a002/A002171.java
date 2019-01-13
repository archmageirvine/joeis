package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002171.
 * @author Sean A. Irvine
 */
public class A002171 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.one();
    for (int k = 1; k <= mN; ++k) {
      p = RING.multiply(p, RING.oneMinusXToTheN(k), mN);
      p = RING.multiply(p, RING.oneMinusXToTheN(2 * k), mN);
    }
    return RING.pow(p, 2, mN).coeff(mN);
  }
}
