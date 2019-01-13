package irvine.oeis.a067;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A067553.
 * @author Sean A. Irvine
 */
public class A067553 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> product = RING.one();
    for (int k = 1; k <= mN; k += 2) {
      product = RING.multiply(product, RING.series(RING.one(), RING.oneMinusXToTheN(Z.valueOf(k), k), mN), mN);
    }
    return product.coeff(mN);
  }
}

