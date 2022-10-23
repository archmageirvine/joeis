package irvine.oeis.a053;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A053442 Moments of generalized Motzkin paths.
 * @author Sean A. Irvine
 */
public class A053442 extends Sequence2 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> C = Polynomial.create(1, 0, -4, -2, 0, 0, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.series(RING.one(), RING.sqrt(C, ++mN), mN).coeff(mN);
  }
}

