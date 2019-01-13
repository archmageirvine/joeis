package irvine.oeis.a003;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003403.
 * @author Sean A. Irvine
 */
public class A003403 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1);
  private static final Polynomial<Z> DEN;
  static {
    Polynomial<Z> den = RING.one();
    for (int k = 1; k <= 10; ++k) {
      den = RING.multiply(den, RING.oneMinusXToTheN(k));
    }
    DEN = den;
  }

  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}

