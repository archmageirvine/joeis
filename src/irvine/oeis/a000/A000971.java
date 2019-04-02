package irvine.oeis.a000;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000971 Fermat coefficients.
 * @author Sean A. Irvine
 */
public class A000971 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = Polynomial.create(1, 3, 3, -4, 10, -4, 3, 3, 1);
  private static final Polynomial<Z> DEN = Polynomial.create(1, -6, 15, -19, 9, 9, -18, 9, 9, -19, 15, -6, 1);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}
