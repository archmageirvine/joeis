package irvine.oeis.a005;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.io.Serializable;

/**
 * A005987.
 * @author Sean A. Irvine
 */
public class A005987 implements Sequence, Serializable {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> product = RING.one();
    for (int k = 1; k <= mN; ++k) {
      Polynomial<Z> t = RING.oneMinusXToTheN(k);
      if ((k & 1) == 0) {
        t = RING.pow(t, k / 4, mN);
      }
      product = RING.multiply(product, RING.series(RING.one(), t, mN));
    }
    return product.coeff(mN);
  }
}

