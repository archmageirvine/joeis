package irvine.oeis.a058;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058385 Number of essentially parallel series-parallel networks with n unlabeled edges, multiple edges not allowed.
 * @author Sean A. Irvine
 */
public class A058385 extends Sequence0 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, -1, 1);
  private int mN = -1;
  private Polynomial<Z> mA = RING.x();

  @Override
  public Z next() {
    if (++mN > 1) {
      Polynomial<Z> prod = RING.one();
      for (int j = 1; j < mN; ++j) {
        prod = RING.multiply(prod, RING.pow(RING.oneMinusXToTheN(j), mA.coeff(j), mN), mN);
      }
      mA = RING.subtract(RING.subtract(RING.series(RING.one(), prod, mN), C), mA);
    }
    return mA.coeff(mN);
  }
}

