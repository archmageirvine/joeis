package irvine.oeis.a023;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023882 Expansion of g.f.: 1/Product_{n&gt;0} (1 - n^n * x^n).
 * @author Sean A. Irvine
 */
public class A023882 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.oneMinusXToTheN(Z.valueOf(k).pow(k), k), mN);
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}

