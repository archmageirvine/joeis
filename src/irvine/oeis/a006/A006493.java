package irvine.oeis.a006;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006493 Generalized Lucas numbers.
 * @author Sean A. Irvine
 */
public class A006493 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Polynomial<Z> NUM = RING.multiply(RING.pow(Polynomial.create(1, -1), 3), Polynomial.create(1, -2, 2));
  private static final Polynomial<Z> DEN = RING.pow(Polynomial.create(1, -1, -1), 5);
  private int mN = -1;

  @Override
  public Z next() {
    return RING.coeff(NUM, DEN, ++mN);
  }
}

