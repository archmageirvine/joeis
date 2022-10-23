package irvine.oeis.a023;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A023879 Number of partitions in expanding space.
 * @author Sean A. Irvine
 */
public class A023879 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> prod = RING.one();
    for (int k = 1; k <= mN; ++k) {
      prod = RING.multiply(prod, RING.pow(RING.oneMinusXToTheN(k), Z.valueOf(k).pow(k - 1), mN), mN);
    }
    return RING.coeff(RING.one(), prod, mN);
  }
}

